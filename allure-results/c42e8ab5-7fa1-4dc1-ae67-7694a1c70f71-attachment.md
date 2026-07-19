# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: PutCall.spec.js >> Test PutApi
- Location: tests\PutCall.spec.js:4:5

# Error details

```
SyntaxError: Unexpected token 'N', "Not Found" is not valid JSON
```

# Test source

```ts
  1  | import {test,expect} from "@playwright/test"
  2  | var bookingID
  3  | //npx playwright test tests/PutCall.spec.js 
  4  | test ("Test PutApi", async function ({request})
  5  | {
  6  |     const authdata=
  7  |     {
  8  |       "username": "admin",
  9  |       "password" : "password123"
  10 |     }
  11 |     const response=await request.post("https://restful-booker.herokuapp.com/booking/auth",{
  12 |     headers:{
  13 |               "Content-Type": "application/json"
  14 |             },
  15 |             data: authdata
  16 |         });
> 17 |         const jsonresp=await response.json();
     |                        ^ SyntaxError: Unexpected token 'N', "Not Found" is not valid JSON
  18 |         const authtoken=jsonresp.token
  19 |         console.log("Token is "+authtoken);
  20 | 
  21 |         const newbookingdata={
  22 |             "firstname":"preetish",
  23 |             "lastname" :"kumar",
  24 |             "totalprice": 300,
  25 |             "depositpaid" :true,
  26 |             "bookingdates":{
  27 |                 "checkin" : "2026-01-01",
  28 |                    "checkout" : "2026-01-01"
  29 |             },
  30 |             "additionalneeds" : "Breakfast"
  31 |         }
  32 |         const newbookingresponse=await request.post("https://restful-booker.herokuapp.com/booking",{
  33 |     headers:{
  34 |               "Content-Type": "application/json"
  35 |             },
  36 |             data: newbookingdata
  37 |         });
  38 |         const newbookingresponsejson=await newbookingresponse.json();
  39 |         console.log(response.status());
  40 |          bookingID=newbookingresponsejson.bookingid
  41 |         console.log("New Booking id"+bookingID);
  42 | 
  43 |          const updatebookingdata={
  44 |             "firstname":"preetish",
  45 |             "lastname" :"kumar",
  46 |             "totalprice": 400,
  47 |             "depositpaid" :true,
  48 |             "bookingdates":{
  49 |                 "checkin" : "2026-01-01",
  50 |                    "checkout" : "2026-04-02"
  51 |             },
  52 |             "additionalneeds" : "Dinner"
  53 |         }
  54 |         const updateresponse=await request.put("https://restful-booker.herokuapp.com/booking/" +bookingID,{
  55 |     headers:{
  56 |               "Content-Type": "application/json",
  57 |               "Cookie":"token="+authtoken
  58 |             },
  59 |             data: updatebookingdata
  60 |         });
  61 |         const updateresponsejson=await updateresponse.json();
  62 |         console.log(updateresponsejson);
  63 | }
  64 |     
  65 | )
```