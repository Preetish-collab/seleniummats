const fs = require("node:fs");
const path = require("node:path");

const testFile = path.resolve(__dirname, "..", "tests", "login.spec.js");
const testCode = fs.readFileSync(testFile, "utf8");

const resetCode = testCode.replace(
  "locator(\"[data-testid='sign-in-button']\").click()",
  "locator(\"#login-button\").click()"
);

fs.writeFileSync(testFile, resetCode);
console.log("Reset complete. The test now uses the broken #login-button locator.");