package test.register;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import pages.registration.RegistrationPage;
import services.authorization.AuthorizationService;


public class Register {

  AuthorizationService authorizationService = new AuthorizationService();
  AuthorizationPage authorizationPage = new AuthorizationPage();
  RegistrationPage registrationPage = new RegistrationPage();

  @Test
  public void checkLinkRegister() {
    authorizationService.openAutorizationPage();
    authorizationPage.getLinkRegister().click();
    String expectedTitle = "Регистрация";
    Assert.assertEquals(registrationPage.getTitle().getText(), expectedTitle,
        "Заголовок должен быть " + expectedTitle);
  }
}