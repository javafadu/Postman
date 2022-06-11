import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest02 {

    @Test
    public void get02() {

        String url = "https://reqres.in/api/users";
        Response response = given().when().get(url);

        // response.prettyPeek();
        //headers + body lari da yazdirir (hersey)

        // response.then().log().all();
        // herseyi yazdirir

        response.then().assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON);

    }
}
