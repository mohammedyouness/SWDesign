package learn.api.mainRequests;

import io.restassured.http.ContentType;

public class PutRequest extends Request{
    public PutRequest(String baseURI,String endPoint) {
        super(endPoint);
    }
    public void setRequestBody(Object requestBody){
        requestSpecification.body(requestBody);
    }
}
