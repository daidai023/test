package com.github
import static io.restassured.RestAssured.given

class UserClient {
    def addUserWithFile(File file) {
        def res = given().baseUri("http://localhost:9990")
                .when()
                .body(file)
                .post("/api/addUserDetails")
                .then()
                .assertThat().statusCode(200).extract().response().getBody().asString()
        res
    }

    def addUserWithString(String body) {
        def res = given().baseUri("http://localhost:9990")
                .when()
                .body(body)
                .post("/api/addUserDetails")
                .then()
                .assertThat().statusCode(200)
                .extract().response().getBody().asString()

    }
}
