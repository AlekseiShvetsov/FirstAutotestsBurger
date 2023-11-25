package test.constructor;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.constructor.ConstructorPage;
import static services.constructor.ConstructorService.openPage;

public class Constructor {

    private final ConstructorPage constructorPage = new ConstructorPage();

    @Test
    public void checkTitle() {
        openPage();
        String expectedTitle = "Соберите бургер";
        Assert.assertEquals(
                constructorPage.getTitle().getText(),
                expectedTitle,
                "Заголовок отсутствует или содержит некорректные данные"
        );
    }

}
