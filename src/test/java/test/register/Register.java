package test.register;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import pages.register.RegisterPage;
import services.authorization.AuthorizationService;


public class Register {

  AuthorizationService authorizationService = new AuthorizationService();
  AuthorizationPage authorizationPage = new AuthorizationPage();
  RegisterPage registerPage = new RegisterPage();

  @Test
  public void checkLinkRegister() {
    authorizationService.openAutorizationPage();
    authorizationPage.getRegister().click();
    String expectedTitle = "Регистрация";
    Assert.assertEquals(registerPage.getTitle().getText(), expectedTitle,
        "Заголовок НЕ 'Регистрация'");
  }
}