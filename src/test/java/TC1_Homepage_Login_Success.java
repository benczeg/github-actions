import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import pages.HomePage;

public class TC1_Homepage_Login_Success extends TestBase{

  //TRACE: változó értékek is
  //DEBUG: nagyon részletes lépések
  //-----------------------
  //INFO: történések, főleg ezeket írjuk, lépések
  //WARNING: figyelmeztetés (else ág -> browser not beállítva)
  //ERROR: ebből még feláll a program
  //FATAL: terminate

  @Test
  public void loginTest(){
    LOG.info("loginTest test started:");
    LOG.debug("creating HomePage object");
    HomePage homePage = new HomePage(driver);
    if(homePage != null){
      LOG.debug("HomePage object created");
    } else {
      LOG.error("HomePage object not created");
    }
    LOG.info("opening home page");
    homePage.load();
    LOG.info("logging in");
    homePage.login();
    LOG.info("checking if logged in:");
    assertThat(driver.getCurrentUrl())
        .isEqualTo("https://www.saucedemo.com/inventory.html")
        .isNotEqualTo("https://www.saucedemo.com/");
    LOG.info("login is success");
  }
}
