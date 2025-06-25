package org.automation.switchalertpagetest;

import org.automation.switchalertpage.SwitchAlertPage;
import org.testng.annotations.Test;

public class SwitchAlertPageTest {
    SwitchAlertPage SwitchAlertPage = new SwitchAlertPage();

    @Test
    public void verifySwitchAlertPage() throws InterruptedException {
        SwitchAlertPage.setUp();
    }
}
