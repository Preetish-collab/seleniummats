package org.project;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestRestEx1 {
    @Test
    public void test_01() {

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Response Body is =>  " + response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
        int statusCode = response.getStatusCode();
        if (statusCode == 200) {
            System.out.println("Status code is correct");
        } else {
            System.out.println("Status code is incorrect");
        }
        {
        }
    }

@Test
public void test_02() {
        given().
        when().
                get("https://reqres.in/api/users?page=2").
        then().
                statusCode(200).
                statusLine("HTTP/1.1 200 OK").
                header("content-type", "application/json; charset=utf-8").
                log().all();
}
}
