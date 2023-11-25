package constructorPage.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static services.constructor.ConstructorService.openPage;

public class Constructor {

    @Test
    public void checkTitle() {
        openPage();
        String expectedTitle = "Соберите бургер";
        Assert.assertEquals(expectedTitle, actualTitle(), "Заголовок НЕ соответствует");
    }
    public static String actualTitle() {
        return $(By.xpath("//h1[contains(text(),'Соберите бургер')]")).getText();
    }
}
