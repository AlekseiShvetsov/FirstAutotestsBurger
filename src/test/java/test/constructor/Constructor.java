package test.constructor;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.constructor.ConstructorPage;
import services.constructor.ConstructorService;

public class Constructor {

  private final ConstructorPage page = new ConstructorPage();
  private final ConstructorService service = new ConstructorService();

    @Test
    public void checkTitle() {
        service.openPage();
        String expectedTitle = "Соберите бургер";
        Assert.assertEquals(
                page.getTitle().getText(),
                expectedTitle,
                "Заголовок отсутствует или содержит некорректные данные"
        );
    }
}