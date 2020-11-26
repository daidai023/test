package com.github

import spock.lang.Specification
import static io.restassured.RestAssured.given

class ForthDemo extends Specification {
    def "should call get user by name and age api successfully"() {
        given: "no given"
        when: "call mock api"
        given().baseUri("http://localhost:9990").log().all()
                .queryParam("name","sanguo")
                .queryParam("prices",12)
                .when()
                .get("api/getBookByQueryParam/test")
                .then().log().all()
                .assertThat().statusCode(200)
        then:"no then"

    }
}
