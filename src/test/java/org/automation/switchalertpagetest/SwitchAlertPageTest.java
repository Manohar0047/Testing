package org.automation.switchalertpagetest;

import org.automation.switchalertpage.SwitchAlertPage;
import org.testng.annotations.Test;

public class SwitchAlertPageTest {
    SwitchAlertPage switchAlertPage = new SwitchAlertPage();

    @Test
    public void verifySwitchAlertPage() throws InterruptedException {
        SwitchAlertPage.setUp();
    }
}
