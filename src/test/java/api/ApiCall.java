package api;

import config.ReadProperties;


import static io.restassured.RestAssured.given;

public class ApiCall {
    public static void callApi(){
        try {
            given().header("ContentType","application/json").when().get(ReadProperties.getProperty("api.employees.url")).then().log().body();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
