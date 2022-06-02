package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

  @FindBy(id = "user-name")
  private WebElement usernameField;
  @FindBy(id = "password")
  private WebElement passwordField;
  @FindBy(id = "login-button")
  private WebElement loginButton;

  public HomePage(WebDriver driver) {
    super(driver);
  }

  public void load(){
    driver.get("https://www.saucedemo.com/");
  }

  public void login(){
    usernameField.sendKeys("standard_user");
    passwordField.sendKeys("secret_sauce");
    loginButton.click();
  }

}
