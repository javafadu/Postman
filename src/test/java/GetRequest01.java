import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {

    @Test
    public void get01() {

        String url = "https://restful-booker.herokuapp.com/booking";
        Response response = given().when().get(url);
        // given().when().get(url) -> Request gondermis olduk
        // Response response -> API den gelen response
        response.prettyPrint();
        // sadece body yi yazdirir (data)



    }
}
