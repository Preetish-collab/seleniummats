import {test,expect} from "@playwright/test"

//npx playwright test tests/DeleteCall.spec.js 
test ("Test DeleteApi", async function ({request}){
const authdata=
    {
      "username": "admin",
      "password" : "password123"
    };
    const response=await request.post("https://restful-booker.herokuapp.com/auth",{headers:{"Content-Type":"application/json"}, data: authdata});
        const jsonresp=await response.json();
        const authtoken=jsonresp.token
        console.log("Token is "+authtoken);

        const newbookingdata={
            "firstname":"Preetish",
            "lastname" :"Kumar",
            "totalprice": 300,
            "depositpaid" :true,
            "bookingdates":{
                "checkin" : "2026-01-01",
                   "checkout" : "2026-01-01"
            },
            "additionalneeds" : "Breakfast"
        } 
        const newbookingresponse=await request.post("https://restful-booker.herokuapp.com/booking",{headers:{"Content-Type": "application/json"},data: newbookingdata});
        const newbookingresponsejson=await newbookingresponse.json();
        const bookingID=newbookingresponsejson.bookingid
        console.log(newbookingresponsejson);
        console.log("New Booking id"+bookingID);


        const deleteresponse=await request.delete("https://restful-booker.herokuapp.com/booking/"+bookingID,{headers:{"Content-Type": "application/json","Cookie":"token="+authtoken}});
        console.log(deleteresponse.status());
        expect(deleteresponse.status()).toBe(201);
         console.log(deleteresponse.statusText());
         expect(deleteresponse.statusText()).toBe("Created");
        console.log("#################################################");
        const getresponse=await request.get("https://restful-booker.herokuapp.com/booking/"+bookingID)
        console.log(getresponse.status());
        expect (getresponse.status()).toBe(404);
        console.log(getresponse.statusText());
        expect(getresponse.statusText()).toBe("Not Found");
})