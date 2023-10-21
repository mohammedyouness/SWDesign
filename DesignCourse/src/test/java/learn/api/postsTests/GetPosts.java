package learn.api.postsTests;

import learn.api.mainRequests.GetRequest;
import learn.api.mainRequests.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetPosts {
    GetRequest getRequest = new GetRequest(Request.baseUri, "/posts");
    @Test
    public void checkStatusCodeWithCheckingTitle() {
        getRequest.setContentType();
        Assert.assertEquals(getRequest.send().statusCode(),200);
        Assert.assertEquals("qui est esse", getRequest.send().body().jsonPath().getString("title[1]"));
    }
}
