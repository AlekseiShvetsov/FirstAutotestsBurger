package test.authorization;

import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import pages.constructor.ConstructorPage;
import pages.profile.ProfilePage;
import services.authorization.AuthorizationService;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.element;

public class Authorization {
    private final AuthorizationService service = new AuthorizationService();
    private final AuthorizationPage email = new AuthorizationPage();
    private final AuthorizationPage password = new AuthorizationPage();
    private final AuthorizationPage enter = new AuthorizationPage();

    private final ConstructorPage page = new ConstructorPage();

    @Test
    public void checkAuthorization() {
        service.openAutorizationPage();
        email.email();
        password.password();
        enter.enterButton();
        element(page.getTitle()).shouldBe(visible.because("Пользователь не авторизован"));
    }
}
