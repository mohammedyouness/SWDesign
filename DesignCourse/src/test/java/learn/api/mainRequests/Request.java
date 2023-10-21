package learn.api.mainRequests;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Request {
    public static String baseUri = "https://jsonplaceholder.typicode.com";
    protected String endPoint;
    protected RequestSpecification requestSpecification;

    public Request(String endPoint) {
        this.endPoint = endPoint;
        requestSpecification = given().baseUri(baseUri).basePath(endPoint);
    }
    public void setHeader(String header,String value){
        requestSpecification.header(header,value);
    }
    public Response send(){
        return requestSpecification.get();
    }
    public Response sendWithCreation(){
        return requestSpecification.post();
    }
    public Response sendWithUpdate(){
        return requestSpecification.put();
    }
    public Response sendWithDeletion(){
        return requestSpecification.delete();
    }
}
