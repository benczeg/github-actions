import org.junit.jupiter.api.Test;
import pages.HomePage;
import static org.assertj.core.api.Assertions.*;

public class TC1_Homepage_Login_Success extends TestBase{

  @Test
  public void loginTest(){
    HomePage homePage = new HomePage(driver);
    homePage.load();
    homePage.login();
    assertThat(driver.getCurrentUrl())
        .isEqualTo("https://www.saucedemo.com/inventory.html")
        .isNotEqualTo("https://www.saucedemo.com/");
  }
}
