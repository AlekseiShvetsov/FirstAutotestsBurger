package pages.constructor;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ConstructorMenu {
    public static String searchTitle() {
        return $(By.xpath("//h1[contains(text(),'Соберите бургер')]")).getText();
        //$("h1").shouldHave(text("Соберите бургер"));
    }
}
