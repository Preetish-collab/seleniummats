# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: DeleteCall.spec.js >> Test DeleteApi
- Location: tests\DeleteCall.spec.js:4:5

# Error details

```
Error: expect(received).toBe(expected) // Object.is equality

Expected: "Function statusText"
Received: [Function statusText]
```

# Test source

```ts
  1  | import {test,expect} from "@playwright/test"
  2  | 
  3  | //npx playwright test tests/DeleteCall.spec.js 
  4  | test ("Test DeleteApi", async function ({request}){
  5  | const authdata=
  6  |     {
  7  |       "username": "admin",
  8  |       "password" : "password123"
  9  |     };
  10 |     const response=await request.post("https://restful-booker.herokuapp.com/auth",{headers:{"Content-Type":"application/json"}, data: authdata});
  11 |         const jsonresp=await response.json();
  12 |         const authtoken=jsonresp.token
  13 |         console.log("Token is "+authtoken);
  14 | 
  15 |         const newbookingdata={
  16 |             "firstname":"Preetish",
  17 |             "lastname" :"Kumar",
  18 |             "totalprice": 300,
  19 |             "depositpaid" :true,
  20 |             "bookingdates":{
  21 |                 "checkin" : "2026-01-01",
  22 |                    "checkout" : "2026-01-01"
  23 |             },
  24 |             "additionalneeds" : "Breakfast"
  25 |         } 
  26 |         const newbookingresponse=await request.post("https://restful-booker.herokuapp.com/booking",{headers:{"Content-Type": "application/json"},data: newbookingdata});
  27 |         const newbookingresponsejson=await newbookingresponse.json();
  28 |         const bookingID=newbookingresponsejson.bookingid
  29 |         console.log(newbookingresponsejson);
  30 |         console.log("New Booking id"+bookingID);
  31 | 
  32 | 
  33 |         const deleteresponse=await request.delete("https://restful-booker.herokuapp.com/booking/"+bookingID,{headers:{"Content-Type": "application/json","Cookie":"token"+authtoken}});
  34 |         console.log(deleteresponse.status());
  35 |         expect(deleteresponse.status()).toBe(403);
  36 |         console.log(deleteresponse.statusText());
> 37 |         expect(deleteresponse.statusText).toBe("Function statusText");
     |                                           ^ Error: expect(received).toBe(expected) // Object.is equality
  38 | })
```