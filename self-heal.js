const fs = require("node:fs");
const path = require("node:path");

const testFile = path.join(__dirname, "tests", "login.spec.js");
const testCode = fs.readFileSync(testFile, "utf8");
const locatorCalls = [...testCode.matchAll(/locator\((['"])(.*?)\1\)\.(\w+)\(/g)];
const repairs = new Map([
	["#login7", "#login2"],
	["#loginusernameee", "#loginusername"],
	["//button[normalize-space()='Loggd in']", "//button[normalize-space()='Log in']"],
	["//button[normalize-space()='Logg in']", "//button[normalize-space()='Log in']"]
]);
const repair = locatorCalls
	.map((match) => ({ match, healedLocator: repairs.get(match[2]) }))
	.find(({ healedLocator }) => healedLocator);

if (!repair) {
	console.log("No supported broken locator found to heal.");
	process.exit(0);
}

const brokenLocator = repair.match[2];
const healedLocator = repair.healedLocator;
const action = repair.match[3];
const healedCode = testCode.replace(
	repair.match[0],
	`locator("${healedLocator}").${action}(`
);
fs.writeFileSync(testFile, healedCode);

console.log("AI self-healing report");
console.log("----------------------");
console.log(`Broken locator: ${brokenLocator}`);
console.log(`Replacement: ${healedLocator}`);
console.log("Reason: the broken selector was replaced with the established Demoblaze login selector.");