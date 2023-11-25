package test.authorization;

import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import services.authorization.AuthorizationService;

public class Authorization {
    private final AuthorizationService service = new AuthorizationService();
    private final AuthorizationPage email = new AuthorizationPage();
    private final AuthorizationPage password = new AuthorizationPage();
    private final AuthorizationPage enter = new AuthorizationPage();

    @Test
    public void checkAuthorization() {
        service.openAutorizationPage();
        email.email();
        password.password();
        enter.enterButton();
    }
}
