import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class baseClass {

    public RequestSpecification setUp(){

        RequestSpecification req  =new RequestSpecBuilder().setBaseUri("https://generator.swagger.io")
                .build();
        return req;
    }

}
