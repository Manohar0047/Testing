package org.automation.switchwindowpagetest;

import org.automation.switchwindow.SwitchWindowPage;
import org.testng.annotations.Test;

public class SwitchWindowPageTest {
    SwitchWindowPage SwitchWindowPage = new SwitchWindowPage();

    @Test
    public void verifySwitchWindowPage(){
        SwitchWindowPage.setUp();
    }
}

