package services.constructor;

import static base.BaseService.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class ConstructorService {
    public static void openPage() {
        open(baseUrl);
    }
}
