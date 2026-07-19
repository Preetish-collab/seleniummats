# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: PostCall.spec.js >> Test PostApi
- Location: tests\PostCall.spec.js:3:5

# Error details

```
SyntaxError: Unexpected token 'N', "Not Found" is not valid JSON
```

# Test source

```ts
  1  | import {test,expect} from "@playwright/test"
  2  | //npx playwright test tests/PostCall.spec.js 
  3  | test ("Test PostApi", async function ({request}){
  4  |     const authdata={
  5  |         "username":"admin ",
  6  |         "password":"password123"
  7  |     }
  8  | 
  9  |  const response=  await request.get("https://restful-booker.herokuapp.com/auth",{headers:{"Content-Type":"application/json"},data:authdata});
  10 |  console.log(response.status());
> 11 |  const responseData=await response.json();
     |                     ^ SyntaxError: Unexpected token 'N', "Not Found" is not valid JSON
  12 |  expect(responseData.token).not.toBeNull();
  13 | })
```