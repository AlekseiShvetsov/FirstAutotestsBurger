package pages.profile;

import static com.codeborne.selenide.Selenide.element;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ProfilePage {

  private final By CONSTRUCTOR_BUTTON = By.xpath(
      "//p");

  public SelenideElement getConstructorButton() {
    return element(CONSTRUCTOR_BUTTON);
  }
}