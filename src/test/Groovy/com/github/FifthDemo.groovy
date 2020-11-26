package com.github

import spock.lang.Specification
import static io.restassured.RestAssured.given

class FifthDemo extends Specification {

    def "should add user successfully"() {
        given:"no given"
        def body = "{\"name\": {\"mainName\":\"zhangsan\",\"alias\":\"zhangsanalias\"},\"age\":123}"
        when:"call get user by name api"
        given().log().all()
                .baseUri("http://localhost:9990")
                .auth().preemptive().basic("root","root123")
                .header("Content-Type","application/json")
                .cookie("session","12345")
                .body(body)
                .when().log().all()
                .post("/api/addUser")
                .then()
                .assertThat().statusCode(200)
        then:"no then"

    }
}
