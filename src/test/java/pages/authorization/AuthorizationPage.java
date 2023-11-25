package pages.authorization;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class AuthorizationPage {
    public void email() {
        $(byName("email")).setValue("alex20-03sh@mail.ru");
    }

    public void password() {
        $(byName("password")).setValue("022093Aa");
    }

    public void enterButton() {
        $(byText("Войти")).pressEnter();
    }
}
