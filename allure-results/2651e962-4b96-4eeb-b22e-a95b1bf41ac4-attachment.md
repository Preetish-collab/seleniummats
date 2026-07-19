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
  2  | 
  3  | //npx playwright test tests/PutCall.spec.js 
  4  | test ("Test PutApi", async function ({request})
  5  | {
  6  |     const authdata=
  7  |     {
  8  |       "username": "admin",
  9  |       "password" : "password123"
  10 |     }
  11 |     const response=await request.post("https://restful-booker.herokuapp.com/booking/auth",{headers:{"Content-Type":"application/json"},data: authdata});
> 12 |         const jsonresp=await response.json();
     |                        ^ SyntaxError: Unexpected token 'N', "Not Found" is not valid JSON
  13 |         const authtoken=jsonresp.token
  14 |         console.log("Token is "+authtoken);
  15 | 
  16 |         const newbookingdata={
  17 |             "firstname":"preetish",
  18 |             "lastname" :"kumar",
  19 |             "totalprice": 300,
  20 |             "depositpaid" :true,
  21 |             "bookingdates":{
  22 |                 "checkin" : "2026-01-01",
  23 |                    "checkout" : "2026-01-01"
  24 |             },
  25 |             "additionalneeds" : "Breakfast"
  26 |         }
  27 |         const newbookingresponse=await request.post("https://restful-booker.herokuapp.com/booking",{headers:{"Content-Type": "application/json"},data: newbookingdata});
  28 |         const newbookingresponsejson=await newbookingresponse.json();
  29 |         const bookingID=newbookingresponsejson.bookingid
  30 |         console.log(newbookingresponsejson);
  31 |         console.log("New Booking id"+bookingID);
  32 | 
  33 |          const updatebookingdata={
  34 |             "firstname":"preetish",
  35 |             "lastname" :"kumar",
  36 |             "totalprice": 400,
  37 |             "depositpaid" :true,
  38 |             "bookingdates":{
  39 |                 "checkin" : "2026-01-01",
  40 |                    "checkout" : "2026-04-02"
  41 |             },
  42 |             "additionalneeds" : "Dinner"
  43 |         }
  44 |         const updateresponse=await request.put("https://restful-booker.herokuapp.com/booking/" +bookingID,{
  45 |     headers:{
  46 |               "Content-Type": "application/json",
  47 |               "Cookie":"token="+authtoken
  48 |             },
  49 |             data: updatebookingdata
  50 |         });
  51 |         const updateresponsejson=await updateresponse.json();
  52 |         console.log(updateresponsejson);
  53 | });
  54 | 
```