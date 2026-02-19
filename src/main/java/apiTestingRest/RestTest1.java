package apiTestingRest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestTest1 {
    @Test
    public void test1() {
        System.out.println("This is REST API testing");
        //specify base URI
        RestAssured.baseURI="https://api.restful-api.dev/objects";
        //create request object
        RequestSpecification httpRequest=RestAssured.given();
        //create response object
        Response response=httpRequest.request(Method.GET,"?id=3&id=5&id=10");
        //print response in console window
        String responseBody=response.getBody().asString();
        System.out.println("Response Body is:"+responseBody);
        String statusLine=response.getStatusLine();
        System.out.println("Status line is:"+statusLine);
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
        int statusCode=response.getStatusCode();
        System.out.println("Status code is:"+statusCode);
        Assert.assertEquals(statusCode,200);


    }
}
