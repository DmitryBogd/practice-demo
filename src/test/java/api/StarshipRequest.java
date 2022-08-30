package api;

import io.restassured.http.ContentType;


import static io.restassured.RestAssured.given;

public class StarshipRequest {
    public void getStarshipRequest(){
        StarShipDto starShip = given()
                .when()
                .contentType(ContentType.JSON)
                .get("https://swapi.dev/api/starships/9/")
                .then().log().all()
                .extract().body().jsonPath().getObject("",StarShipDto.class);
    }
}
