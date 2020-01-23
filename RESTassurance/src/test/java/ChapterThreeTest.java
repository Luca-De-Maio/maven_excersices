import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class ChapterThreeTest {
    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpecification;

    @DataProvider
    public Object[][] zipCodes() {
        return new Object[][]{
                {"us", "90210", "Beverly Hills"},
                {"us", "12345", "Schenectady"},
                {"ca", "B2R", "Waverley"}
        };
    }

    @BeforeClass()
    public static void createRequestSpecification(){

        requestSpec = new RequestSpecBuilder().
                setBaseUri("http://api.zippopotam.us").
                build();
    }

    @BeforeClass
    public static void createResponseSpecification(){

        responseSpecification = new ResponseSpecBuilder().
                expectStatusCode(200).
                expectContentType(ContentType.JSON).
                build();
    }

    @Test(dataProvider = "zipCodes")
    public void severalZipCodesToTest(String countryCode, String zipCode, String expectedPlaceName) {
        String placeName =
        given().log().all().
                spec(requestSpec.pathParam("countryCode", countryCode).pathParam("zipCode", zipCode)).
        when().
                get("http://zippopotam.us/{countryCode}/{zipCode}").
        then().
                spec(responseSpecification).
        and().
                extract().
                path("places[0].'place name'").toString().replace('"', ' ');
        Assert.assertEquals(placeName, expectedPlaceName);
    }



}
