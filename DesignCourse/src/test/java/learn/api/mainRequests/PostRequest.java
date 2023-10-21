package learn.api.mainRequests;

import io.restassured.http.ContentType;

public class PostRequest extends Request{
    public PostRequest(String baseURI,String endPoint) {
        super(endPoint);
    }
    public void setRequestBody(Object requestBody){
        requestSpecification.body(requestBody);
    }
}
