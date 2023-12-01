package pages.constructor;

import com.codeborne.selenide.BearerTokenCredentials;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;

import static com.codeborne.selenide.Selenide.element;

public class ConstructorPage {

  private final By TITLE = By.xpath("//h1");
  private final By BUN = By.xpath(
      "//*[@id=\"root\"]/div/main/div/section[1]/div/div[1]/a[1]/p");
  private final By CONSCTRUCTOR_BURGER = By.xpath(
      "//*[@id=\"root\"]/div/main/div/section[2]");
  private final By TOPPINGS_BUTTON = By.xpath(
      "//*[@id=\"root\"]/div/main/div/section[1]/nav/ul/div[2]");
  private final By TOPPINGS = By.xpath(
      "//*[@id=\"root\"]/div/main/div/section[1]/div/div[2]/a[2]/p");
  private final By SAUCES_BUTTON = By.xpath(
      "//*[@id=\"root\"]/div/main/div/section[1]/nav/ul/div[3]");
  private final By SAUCES = By.xpath(
      "//*[@id=\"root\"]/div/main/div/section[1]/div/div[3]/a[3]/p");
  private final By ORDER_BUTTON = By.xpath(
      "//*[@id=\"root\"]/div/main/div/section[2]/div[3]/button");
  private final By ORDER_IDENTIFIER = By.xpath("//*[@id=\"modals\"]/div[1]/div[2]/p[1]");

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