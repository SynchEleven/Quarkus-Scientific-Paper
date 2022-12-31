package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.acme.hibernate.orm.panache.Fruit;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleResourceTest {

}