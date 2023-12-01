package pages.registration;

import static com.codeborne.selenide.Selenide.element;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class RegistrationPage {

  private final By TITLE = By.xpath("//h3");

  public SelenideElement getTitle() {
    return element(TITLE);
  }
}