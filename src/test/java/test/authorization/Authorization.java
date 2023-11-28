package test.authorization;

import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import pages.constructor.ConstructorPage;
import services.authorization.AuthorizationService;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.element;

public class Authorization {
    private final AuthorizationService authorizationService = new AuthorizationService();
    private final AuthorizationPage authorizationPage = new AuthorizationPage();
    private final ConstructorPage constructorPage = new ConstructorPage();
    public String email = "alex20-03sh@mail.ru";
    public String password = "022093Aa";

    @Test
    public void checkAuthorization() {
        authorizationService.openAutorizationPage();
        authorizationPage.setEmail(email);
        authorizationPage.setPassword(password);
        authorizationPage.clickButton();
        element(constructorPage.getTitle())
                .shouldBe(visible.because("Пользователь не авторизован"));
    }
}