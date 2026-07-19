# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: PutCall.spec.js >> Test PutApi
- Location: tests\PutCall.spec.js:3:5

# Error details

```
SyntaxError: Unexpected token 'I', "Internal S"... is not valid JSON
```

# Test source

```ts
  1  | import {test,expect} from "@playwright/test"
  2  | //npx playwright test tests/PutCall.spec.js 
  3  | test ("Test PutApi", async function ({request})
  4  | {
  5  |     const authdata=
  6  |     {
  7  |       "username": "admin",
  8  |       "password" : "password123"
  9  |     }
  10 |     const response=await request.post("https://restful-booker.herokuapp.com/booking",{
  11 |     headers:{
  12 |               "Content-Type": "application/json"
  13 |             },
  14 |             data: authdata
  15 |         });
> 16 |         const jsonresp=await response.json();
     |                        ^ SyntaxError: Unexpected token 'I', "Internal S"... is not valid JSON
  17 |         const authtoken=jsonresp.token
  18 |         console.log("Token is "+authtoken);
  19 | 
  20 |         const newbookingdata={
  21 |             "firstname":"preetish",
  22 |             "lastname" :"kumar",
  23 |             "totalprice": 300,
  24 |             "depositpaid" :true,
  25 |             "bookingdates":{
  26 |                 "checkin" : "2026-01-01",
  27 |                    "checkout" : "2026-01-01"
  28 |             },
  29 |             "additionalneeds" : "Breakfast"
  30 |         }
  31 |         const newbookingresponse=await request.post("https://restful-booker.herokuapp.com/booking",{
  32 |     headers:{
  33 |               "Content-Type": "application/json"
  34 |             },
  35 |             data: newbookingdata
  36 |         });
  37 |         const newbookingresponsejson=await newbookingresponse.json();
  38 |         console.log(response.status());
  39 |         const bookingID=newbookingresponsejson.bookingid
  40 |         console.log("New Booking id"+bookingID);
  41 | 
  42 |          const updatebookingdata={
  43 |             "firstname":"preetish",
  44 |             "lastname" :"kumar",
  45 |             "totalprice": 400,
  46 |             "depositpaid" :true,
  47 |             "bookingdates":{
  48 |                 "checkin" : "2026-01-01",
  49 |                    "checkout" : "2026-04-02"
  50 |             },
  51 |             "additionalneeds" : "Dinner"
  52 |         }
  53 |         const updateresponse=await request.put("https://restful-booker.herokuapp.com/booking/" +bookingID,{
  54 |     headers:{
  55 |               "Content-Type": "application/json",
  56 |               "Cookie":"token="+authtoken
  57 |             },
  58 |             data: updatebookingdata
  59 |         });
  60 |         const updateresponsejson=await updateresponse.json();
  61 |         console.log(updateresponsejson);
  62 | }
  63 |     
  64 | )
```