package learn.api.postsTests;

import learn.api.mainRequests.PostRequest;
import learn.api.mainRequests.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePost {
    PostRequest postRequest = new PostRequest(Request.baseUri,"/posts");
    private static final String requestBody = """
          {
              "title": "foo",
              "body": "bar",
              "userId": "1"\s
            }""";

    @Test
    public void verifyPostBeingCreated() {
        postRequest.setHeader("Content-type","application/json");
        postRequest.setRequestBody(requestBody);
        postRequest.sendWithCreation();
        Assert.assertEquals(postRequest.sendWithCreation().statusCode(),201);
        Assert.assertEquals("foo", postRequest.sendWithCreation().body().jsonPath().getString("title"));
        Assert.assertEquals("bar", postRequest.sendWithCreation().body().jsonPath().getString("body"));
        Assert.assertEquals("1", postRequest.sendWithCreation().body().jsonPath().getString("userId"));
        Assert.assertEquals("101", postRequest.sendWithCreation().body().jsonPath().getString("id"));
    }

}
