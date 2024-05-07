import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class generatorTests extends baseClass{
    RequestSpecification spec = setUp();

    @Test
    public void getClientsLanguageFromClientId(){


        given(spec).log().all().pathParam("language","ada")
                .when().get("api/gen/clients/{language}")
                .then().log().all().assertThat().statusCode(200);

    }

    @Test
    public void postClientsToLanguage(){

        given(spec).header("Content-Type","application/json").log().all().pathParam("language","ada")
                .body(payloads.postClientsToLanguage()).when().post("api/gen/clients/{language}")
                .then().log().all().assertThat().statusCode(200);

    }

}
