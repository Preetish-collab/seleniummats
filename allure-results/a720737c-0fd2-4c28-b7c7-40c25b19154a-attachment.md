# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: GetCall.spec.js >> Test GetApi
- Location: tests\GetCall.spec.js:3:5

# Error details

```
Error: expect(received).toHaveProperty(path, value)

Expected path: "Id"
Received path: []

Expected value: 1
Received value: {"body": "quia et suscipit
suscipit recusandae consequuntur expedita et cum
reprehenderit molestiae ut ut quas totam
nostrum rerum est autem sunt rem eveniet architecto", "id": 1, "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "userId": 1}
```

# Test source

```ts
  1  | import {test,expect} from "@playwright/test"
  2  | //npx playwright test tests/GetCall.spec.js 
  3  | test ("Test GetApi", async function ({request}){
  4  | 
  5  |  const resp=  await request.get("https://jsonplaceholder.typicode.com/posts/1");
  6  |  const respbdy=await resp.body();
  7  |  const respstatus=resp.status();
  8  |  const reststatustest=resp.statusText();
  9  |  const respjson=await resp.json();
  10 |  const respheadr=await resp.headers();
  11 |  const respheadrarry=await resp.headersArray();
  12 |  //console.log(respstatus);
  13 |  //console.log(reststatustest);
  14 |  //console.log(respbdy);
  15 |  //console.log(respjson);
  16 | //console.log(respheadr);
  17 |  //console.log(respheadrarry);
  18 |  expect(respstatus).toBe(200);
  19 |  expect(reststatustest).toBe("OK");
  20 |  expect(resp.ok()).toBeTruthy();
  21 |  expect(respjson).toHaveProperty("userId",1);
> 22 |  expect(respjson).toHaveProperty("Id",1);
     |                   ^ Error: expect(received).toHaveProperty(path, value)
  23 |  expect(respjson).toHaveProperty("title","sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
  24 |  expect(respjson.body).toContain("quia et suscipit");
  25 | 
  26 | 
  27 | })
```