package test.feed;

import org.testng.annotations.Test;
import pages.feed.FeedPage;
import services.feed.FeedService;

public class NumberOfOrders {

  FeedService feedService = new FeedService();
  FeedPage feedPage = new FeedPage();

  @Test
  public void checkNumberOfOrders() {
    feedService.openFeedPage();
    String number = feedPage.getNumberOfOrders().getText();
    int actualNumber = Integer.parseInt(number);
    if (actualNumber >= 149) {
    } else {
      System.out.println("Проверка количества заказов не пройдена");
    }
  }
}