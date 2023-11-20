import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class testWebTitle {
    @Test
    public void checkTitle() {
        open("https://burger-frontend-6.prakticum-team.ru/");
        String name = "Соберите бургер";
        $("h1").shouldHave(text("name"));
        if ($("р1").has(text(name))) {
            System.out.println("Заголовок верный");
        }
    }
}
