package services.constructor;

import static base.BaseService.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class ConstructorService {
    public void openPage() {
        open(baseUrl);
    }
}
