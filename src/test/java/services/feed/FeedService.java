package services.feed;

import static com.codeborne.selenide.Selenide.*;

import base.BaseService;

public class FeedService extends BaseService {

  public void openFeedPage() {
    open(baseUrl + "/feed");
  }
}