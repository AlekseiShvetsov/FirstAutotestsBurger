package services.constructor;

import base.BaseService;

import static com.codeborne.selenide.Selenide.*;

public class ConstructorService extends BaseService {
    public void openPage() {
        open(baseUrl);
    }
}
