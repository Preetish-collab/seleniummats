import {test,expect} from "@playwright/test"
//npx playwright test tests/GetCall.spec.js 

test ("Test GetApi", async function ({request}){
 const resp=  await request.get("https://jsonplaceholder.typicode.com/posts/1");
 const respbdy=await resp.body();
 const respstatus=await resp.status();
 const reststatustest=await resp.statusText();
 const respjson=await resp.json();
 const respheadr=await resp.headers();
 const respheadrarry=await resp.headersArray();
 //console.log(respstatus);
 //console.log(reststatustest);
 //console.log(respbdy);
 //console.log(respjson);
//console.log(respheadr);
 //console.log(respheadrarry);
 expect(respstatus).toBe(200);
 expect(reststatustest).toBe("OK");
 expect(resp.ok()).toBeTruthy();
 expect(respjson).toHaveProperty("userId",1);
 expect(respjson).toHaveProperty("id",1);
 expect(respjson).toHaveProperty("title","sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
 expect(respjson.body).toContain("quia et suscipit");


})