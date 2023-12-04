package helps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

import com.codeborne.selenide.SelenideElement;
import pages.constructor.ConstructorPage;

public class Helps {

  ConstructorPage constructorPage = new ConstructorPage();

  public void waitForElement() throws InterruptedException {
    int count = 1;
    String expectedText = "идентификатор заказа";
    SelenideElement actualText = constructorPage.getOrderIdentifier();

    do {
      if (actualText.is(visible) && actualText.has(text(expectedText))) {
        break;
      } else {
        Thread.sleep(1000);
        count++;
      }
    } while (count <= 100);
  }
}