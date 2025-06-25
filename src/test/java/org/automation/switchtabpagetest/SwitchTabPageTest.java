package org.automation.switchtabpagetest;

import org.automation.switchtab.SwitchTabPage;
import org.testng.annotations.Test;

public class SwitchTabPageTest {
    SwitchTabPage SwitchTabPage = new SwitchTabPage();

    @Test
    public void verifySwitchTabPage() {
        SwitchTabPage.setUp();
    }

}
