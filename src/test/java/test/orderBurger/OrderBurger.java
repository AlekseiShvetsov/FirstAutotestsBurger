package test.orderBurger;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import pages.constructor.ConstructorPage;
import pages.profile.ProfilePage;
import test.authorization.Authorization;

public class OrderBurger {

  ProfilePage profilePage = new ProfilePage();
  ConstructorPage constructorPage = new ConstructorPage();
  SelenideElement targetConstructorBurger = $(constructorPage.getConstructorBurger());
  Authorization authorization = new Authorization();

  @Test
  public void checkOrderBurger() {
    authorization.checkAuthorization();

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