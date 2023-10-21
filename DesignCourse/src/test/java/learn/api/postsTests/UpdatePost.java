package learn.api.postsTests;

import learn.api.mainRequests.PostRequest;
import learn.api.mainRequests.PutRequest;
import learn.api.mainRequests.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdatePost {
    PutRequest putRequest = new PutRequest(Request.baseUri,"/posts/1");
    private static final String requestBody = """
        {
              "title": "foo",
              "body": "baz",
              "userId": "1",
              "id": "1"\s
            }""";

    @Test
    public void verifyPostBeingUpdated() {
        putRequest.setHeader("Content-type","application/json");
        putRequest.setRequestBody(requestBody);
        putRequest.sendWithUpdate();
        Assert.assertEquals(putRequest.sendWithUpdate().statusCode(),200);
        Assert.assertEquals("baz", putRequest.sendWithUpdate().body().jsonPath().getString("body"));
        Assert.assertEquals("1", putRequest.sendWithUpdate().body().jsonPath().getString("id"));
    }

}
