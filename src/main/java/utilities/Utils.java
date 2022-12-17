package utilities;


import constants.Endpoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Utils {

    static Endpoints endpoints;
    public Utils(){ endpoints = new Endpoints(); }
    public String getallPersons() {

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .get(endpoints.getallPersonEndpoint());
        return response.asString();
    }

    public Response post(String uri, String payload){

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .post(uri);
        return response;
    }

    public Response put(String uri, String payload){

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .put(uri);
        return response;
    }

    public Response patch(String uri, String payload){

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .patch(uri);
        return response;
    }

    public Response delete(String uri){

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .delete(uri);
        return response;
    }

}
