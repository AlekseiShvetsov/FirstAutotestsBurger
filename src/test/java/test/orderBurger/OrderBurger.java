package test.orderBurger;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import pages.constructor.ConstructorPage;
import pages.profile.ProfilePage;
import services.authorization.AuthorizationService;

public class OrderBurger {

  AuthorizationService authorizationService = new AuthorizationService();
  AuthorizationPage authorizationPage = new AuthorizationPage();
  ProfilePage profilePage = new ProfilePage();
  ConstructorPage constructorPage = new ConstructorPage();
  SelenideElement targetConstructorBurger = $(constructorPage.getConstructorBurger());

  @Test
  public void checkOrderBurger() {
    String email = "alex20-03sh@mail.ru";
    String password = "022093Aa";

    authorizationService.openAutorizationPage();
    authorizationPage.setEmail(email);
    authorizationPage.setPassword(password);
    authorizationPage.getEnterButton().click();

    profilePage.getConstructorButton().click();
    SelenideElement sourceBun = $(constructorPage.getBun());
    sourceBun.dragAndDropTo(targetConstructorBurger);

    constructorPage.getToppingsButton().click();
    SelenideElement sourceToppings = $(constructorPage.getToppings());
    sourceToppings.dragAndDrop(DragAndDropOptions.to(targetConstructorBurger));

    constructorPage.getSaucesButton().click();
    SelenideElement sourceSauces = $(constructorPage.getSauces());
    sourceSauces.dragAndDrop(DragAndDropOptions.to(targetConstructorBurger));

    targetConstructorBurger.shouldBe(visible);
    constructorPage.getOrderButton().click();
    sleep(15000);
    String expectedText = "идентификатор заказа";
    constructorPage.getOrderIdentifier().shouldHave(text(expectedText), visible);
  }
}