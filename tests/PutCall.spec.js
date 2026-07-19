import {test,expect} from "@playwright/test"

//npx playwright test tests/PutCall.spec.js 
test ("Test PutApi", async function ({request})
{
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

         const updatebookingdata={
            "firstname":"preetish",
            "lastname" :"kumar",
            "totalprice": 400,
            "depositpaid" :true,
            "bookingdates":{
                "checkin" : "2026-01-01",
                   "checkout" : "2026-04-02"
            },
            "additionalneeds" : "Dinner"
        }
        const updateresponse=await request.put("https://restful-booker.herokuapp.com/booking/" +bookingID,{headers:{"Accept": "application/json","Cookie":"token="+authtoken},data: updatebookingdata});
        const updateresponsejson=await updateresponse.json();
        console.log(updateresponsejson);
});


