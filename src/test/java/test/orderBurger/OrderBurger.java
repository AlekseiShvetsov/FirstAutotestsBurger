package test.orderBurger;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import helps.Helps;
import org.testng.annotations.Test;
import pages.constructor.ConstructorPage;
import pages.profile.ProfilePage;
import test.authorization.Authorization;

public class OrderBurger {

  ProfilePage profilePage = new ProfilePage();
  ConstructorPage constructorPage = new ConstructorPage();
  SelenideElement targetConstructorBurger = $(constructorPage.getConstructorBurger());
  Authorization authorization = new Authorization();
  Helps helps = new Helps();

  @Test
  public void checkOrderBurger() throws InterruptedException {
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
    helps.waitForElement();
  }
}