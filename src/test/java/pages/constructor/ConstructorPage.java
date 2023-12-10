package pages.constructor;

import com.codeborne.selenide.BearerTokenCredentials;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;

import static com.codeborne.selenide.Selenide.element;

public class ConstructorPage {

  private final By TITLE = By.xpath("//h1");
  private final By BUN = By.xpath(
      "//div/div/a/p");
  private final By CONSCTRUCTOR_BURGER = By.xpath(
      "//section[2]");
  private final By TOPPINGS_BUTTON = By.xpath(
      "//ul/div[2]");
  private final By TOPPINGS = By.xpath(
      "//div[2]/a[2]/p");
  private final By SAUCES_BUTTON = By.xpath(
      "//div[3]");
  private final By SAUCES = By.xpath(
      "//div[3]/a[3]/p");
  private final By ORDER_BUTTON = By.xpath(
      "//section[2]/div[3]/button");
  private final By ORDER_IDENTIFIER = By.xpath("//div[2]/p");

  public SelenideElement getTitle() {
    return element(TITLE);
  }

  public SelenideElement getBun() {
    return element(BUN);
  }

  public SelenideElement getConstructorBurger() {
    return element(CONSCTRUCTOR_BURGER);
  }

  public SelenideElement getToppingsButton() {
    return element(TOPPINGS_BUTTON);
  }

  public SelenideElement getToppings() {
    return element(TOPPINGS);
  }

  public SelenideElement getSaucesButton() {
    return element(SAUCES_BUTTON);
  }

  public SelenideElement getSauces() {
    return element(SAUCES);
  }

  public SelenideElement getOrderButton() {
    return element(ORDER_BUTTON);
  }

  public SelenideElement getOrderIdentifier() {
    return element(ORDER_IDENTIFIER);
  }
}