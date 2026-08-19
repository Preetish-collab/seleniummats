const { test, expect } = require('@playwright/test')
// all sanity:
// npx playwright test tests/Tags.spec.js --project chromium --grep @sanity

// all regression:
// npx playwright test tests/Tags.spec.js --project chromium --grep @reg 


// both sanity & regression:
// npx playwright test tests/Tags.spec.js --project chromium --grep @reg@sanity 


// only sanity but not regression:
// npx playwright test tests/Tags.spec.js --project chromium --grep @sanity --grep-invert @reg


// only regression but not sanity:
// npx playwright test tests/Tags.spec.js --project chromium --grep @reg --grep-invert @sanity


test('test1', async ({ page }) => {
    console.log('this is test1.....')
});

test('test2@sanity', async ({ page }) => {
    console.log('this is test2.....')
});


test('test3@sanity', async ({ page }) => {
    console.log('this is test3.....')
});


test('test4@reg', async ({ page }) => {
    console.log('this is test4.....')
});


test('test5@reg', async ({ page }) => {
    console.log('this is test5.....')
});

test('test6@reg@sanity', async ({ page }) => {
    console.log('this is test6.....')
});
