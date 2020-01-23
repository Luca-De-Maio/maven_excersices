import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestAssert {

    @Test
    public void testZipCode(){

        given().
        when().
            get("http://api.zippopotam.us/us/90210").
        then().
                assertThat().
                body("places[0].'place name'", equalTo("Beverly Hills"));
    }

    @Test
    public void testZipCodeState() {
        given().
                log().all().
        when().
                get("http://api.zippopotam.us/us/90210").
        then().
                assertThat().
                body("places[0].state", equalTo("California"));
    }

    @Test
    public void informationLog(){
        given().
                log().all().
        when().
            get("http://zippopotam.us/us/90210").
        then().
                log().body();
    }
}

