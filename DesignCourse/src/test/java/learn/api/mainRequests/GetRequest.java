package learn.api.mainRequests;

import io.restassured.http.ContentType;

public class GetRequest extends Request{
    public GetRequest(String baseUri, String endPoint) {
        super(endPoint);
    }
    public void setContentType(){
        requestSpecification.contentType(ContentType.JSON);
    }
}
