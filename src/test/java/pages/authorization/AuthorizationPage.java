package pages.authorization;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class AuthorizationPage {
    private final By EMAIL = By.xpath("//input[@name='email']");

    public SelenideElement getEmail() {
        return element(EMAIL);
    }

    public void setEmail(String email) {
        getEmail().setValue(email);
    }

    private final By PASSWORD = By.xpath("//input[@name='password']");

    public SelenideElement getPassword() {
        return element(PASSWORD);
    }

    public void setPassword(String password) {
        getPassword().setValue(password);
    }

    private final By CLICKBUTTON = By.xpath("//button[contains(text(), 'Войти')]");

    public SelenideElement getButton() {
        return element(CLICKBUTTON);
    }

    public void clickButton() {
        getButton().click();
    }
}