package com.NeelamKumari.ex02_RA_TestNG_AllureReport;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import javax.management.DescriptorKey;

public class APITest005_TC_TestNG_fix {
    @Test
    @Description("TC#2: verify that the valid pincode gives 200 ok")
    public void test_Get_Positive_TC1()
    {
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110048")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    @Description("TC#2 - verify that the invalid pincode gives the 200 ok")
    public void test_Get_Negative_TC2()
    {
    RestAssured
            .given()
            .baseUri("https://api.zippopotam.us")
            .basePath("/IN/" + "-1")
            .when()
            .get()
            .then()
            .log().all().statusCode(200);
    }
    @Test
    @Description("TC#3: Verify that the invalid pincode gives 200 ok")
    public void test_Get_Negative_TC3()
    {
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN"+"@")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
}
