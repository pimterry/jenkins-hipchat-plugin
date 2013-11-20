package jenkins.plugins.hipchat;

import jenkins.plugins.hipchat.StandardHipChatService;
import org.junit.Before;
import org.junit.Test;

public class StandardHipChatServiceTest {

    /**
     * Publish should generally not rethrow exceptions, or it will cause a build job to fail at end.
     */
    @Test
    public void publishWithBadUrlShouldNotRethrowExceptions() {
        StandardHipChatService service = new StandardHipChatService("http://hostvaluethatwillcausepublishtofail", "token", "room", "from");
        service.publish("message");
    }
}
