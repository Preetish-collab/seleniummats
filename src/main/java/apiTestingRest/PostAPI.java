package apiTestingRest;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostAPI {
    @Test
    public void posttest() {
        System.out.println("This is REST API Post testing");
        //specify base URI
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
        //create request object
        RequestSpecification httpRequest = RestAssured.given();
        //Request payload sending along with post request
        JSONObject requestParams = new JSONObject();
        PreemptiveBasicAuthScheme authScheme=new PreemptiveBasicAuthScheme();
        authScheme.setUserName("preetish");
        authScheme.setPassword("Gudu1990@");
        RestAssured.authentication=authScheme;
        requestParams.put("name", "Crapes");
        requestParams.put("salary", "125");
        requestParams.put("age", "23");
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(requestParams.toJSONString());
        //create response object
        Response response = httpRequest.request(Method.POST, "/create");
        //print response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is:" + responseBody);

        int statusCode = response.getStatusCode();
        System.out.println("Status code is:" + statusCode);
        Assert.assertEquals(statusCode, 201);

        String successCode = response.jsonPath().get("successCode");
        Assert.assertEquals(successCode, "OPERATION_SUCCESS");
    }
}