package com.NeelamKumari.ex01_RA_Basics;

import io.restassured.RestAssured;

public class APITesting001 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter pincode: ");
        String pincode = scanner.nextLine();
        RestAssured
                .given()
                    .baseUri("https://zippopotam.us")
                    .basePath("IN/"+pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
        }
}
