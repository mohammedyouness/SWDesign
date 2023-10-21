package learn.api.postsTests;

import learn.api.mainRequests.DeleteRequest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletePost {
    DeleteRequest deleteRequest = new DeleteRequest("https://jsonplaceholder.typicode.com","/posts/1");
    @Test
    public void verifyPostBeingDeleted() {
        deleteRequest.setHeader("Content-type","application/json");
        deleteRequest.sendWithDeletion().prettyPrint();
        Assert.assertEquals(deleteRequest.sendWithDeletion().statusCode(),200);
    }
}
