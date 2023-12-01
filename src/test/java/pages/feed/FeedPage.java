package pages.feed;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FeedPage {

  private final By TITLE = By.xpath("//h1");
  private final By NUMBER_OF_ORDERS = By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/section/p[1]");

  public SelenideElement getTitle() {
    return element(TITLE);
  }

  public SelenideElement getNumberOfOrders() {
    return element(NUMBER_OF_ORDERS);
  }
}