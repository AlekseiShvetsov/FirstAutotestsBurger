package pages.authorization;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class AuthorizationPage {
    private final By TITLE = By.xpath("//h1");

    public SelenideElement getTitle() {
        return element(TITLE);
    }
}
