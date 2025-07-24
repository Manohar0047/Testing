import org.automation.coupons.LatestNewsPage;
import org.resource.BasePage;
import org.resource.Utility;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.resource.BasePage.driver;

public class LatestNewsPageTest {

    LatestNewsPage LatestNewsPage = new LatestNewsPage(BasePage.getDriver());
    @Test
    public  void verifyLatestNewsPage() throws IOException {
        LatestNewsPage.setUp();

        Utility.takeScreenShot(BasePage.getDriver(), "NewPage");


    }
}
