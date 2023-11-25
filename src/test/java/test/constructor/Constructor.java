package test.constructor;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.constructor.ConstructorPage;
import services.constructor.ConstructorService;

public class Constructor {

    private final ConstructorPage constructorPage = new ConstructorPage();
    private final ConstructorService constructorService = new ConstructorService();

    @Test
    public void checkTitle() {
        constructorService.openPage();
        String expectedTitle = "Соберите бургер";
        Assert.assertEquals(
                constructorPage.getTitle().getText(),
                expectedTitle,
                "Заголовок отсутствует или содержит некорректные данные"
        );
    }

}
