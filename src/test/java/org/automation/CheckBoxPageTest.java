package org.automation;

import org.automation.coupons.CheckBoxPage;
import org.testng.annotations.Test;

public class CheckBoxPageTest {
    CheckBoxPage checkBoxPage = new CheckBoxPage();

    @Test
    public void verifyCheckBoxPage() {
        checkBoxPage.setUp();
    }

}
