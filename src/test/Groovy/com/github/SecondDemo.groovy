package com.github

import spock.lang.Specification
import static io.restassured.RestAssured.given

class SecondDemo extends Specification {
    def "should call mock api successfully"() {

        given:"no given"
        when:"call mock api"
        given().baseUri("http://localhost:9990")
                .when()
                .get("api/getBook/test")
                .then()
                .assertThat().statusCode(200)
        then:"no then"

    }
}
