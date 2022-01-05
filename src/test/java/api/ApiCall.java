package api;

import config.ReadProperties;
import io.restassured.response.Response;
import model.Employee;
import sun.net.www.http.HttpClient;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

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
