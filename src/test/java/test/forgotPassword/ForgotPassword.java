package test.forgotPassword;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import pages.forgotPassword.ForgotPasswordPage;
import services.authorization.AuthorizationService;

import static com.codeborne.selenide.Selenide.*;

public class ForgotPassword {

  AuthorizationService authorizationService = new AuthorizationService();
  AuthorizationPage authorizationPage = new AuthorizationPage();
  ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

  @Test
  public void checkLinkForgotPassword() {
    authorizationService.openAutorizationPage();
    authorizationPage.getLinkForgotPassword().click();
    String expectedTitle = "Восстановление пароля";

    Assert.assertEquals(forgotPasswordPage.getTitle().getText(), expectedTitle,
        "Заголовок должен быть " + expectedTitle);
  }
}