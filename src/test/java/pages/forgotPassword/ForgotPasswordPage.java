package pages.forgotPassword;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class ForgotPasswordPage {

  private final By TITLE = By.xpath("//h3");

  public SelenideElement getTitle() {
    return element(TITLE);
  }
}