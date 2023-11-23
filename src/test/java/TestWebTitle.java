import org.testng.Assert;
import org.testng.annotations.Test;
import static pages.constructor.ConstructorMenu.searchTitle;
import static services.constructor.ConstructorService.openPage;

public class TestWebTitle {
    @Test
    public void checkTitle() {
        openPage();
        searchTitle();
        String title = "Соберите бургер";
        Assert.assertEquals(title, searchTitle(), "Заголовок НЕ соответствует");
        if (title.equals(searchTitle())) {
            System.out.println("Заголовок соответствует");
        }
    }
}
