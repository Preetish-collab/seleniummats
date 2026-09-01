import {test,expect} from "@playwright/test"
//npx playwright test tests/PostCall.spec.js 
test ("Test PostApi", async function ({request}){
    const bookingData=
    {
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
                   "checkin" : "2018-01-01",
                   "checkout" : "2019-01-01"
                     },
    "additionalneeds" : "Breakfast"
   }

 const response=  await request.post("https://restful-booker.herokuapp.com/booking",{
    headers:{
              "Content-Type": "application/json"
            },
            data: bookingData
        });
 console.log(response.status());
 const responseData=await response.json();
 console.log(responseData);
 expect(responseData.bookingid).not.toBeNull();
 expect(responseData.booking.firstname).toBe("Jim");
})