package test.feed;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.feed.FeedPage;
import services.feed.FeedService;

public class NumberOfOrders {

  FeedService feedService = new FeedService();
  FeedPage feedPage = new FeedPage();

  @Test
  public void checkNumberOfOrders() {
    boolean checkPassed = false;
    feedService.openFeedPage();
    String number = feedPage.getNumberOfOrders().getText();
    int actualNumber = Integer.parseInt(number);
    if (actualNumber >= 149) {
      checkPassed = true;
    }
    Assert.assertTrue(checkPassed, "Проверка количества заказов не пройдена");
  }
}