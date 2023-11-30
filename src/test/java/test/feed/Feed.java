package test.feed;

import org.testng.annotations.Test;
import pages.feed.FeedPage;
import services.feed.FeedService;
import org.testng.Assert;

public class Feed {

  private final FeedService feedService = new FeedService();
  private final FeedPage feedPage = new FeedPage();

  @Test
  public void checkTitleFeed() {
    feedService.openFeedPage();
    String expectedTitle = "Лента заказов";
    Assert.assertEquals(feedPage.getTitle().getText(), expectedTitle,
        "Заголовок НЕ соответствует 'Лента заказов'");
  }
}