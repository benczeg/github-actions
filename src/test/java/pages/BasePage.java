package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
  protected WebDriver driver;
  protected Logger LOG;

  public BasePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver,this);
    LOG = LoggerFactory.getLogger(getClass());
  }
}
