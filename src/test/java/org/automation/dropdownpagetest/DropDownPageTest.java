package org.automation.dropdownpagetest;

import org.automation.dropdownpage.DropdownPage;
import org.testng.annotations.Test;

public class DropDownPageTest {
    DropdownPage DropdownPage = new DropdownPage();

    @Test
    public void verifyDropdownPage() throws InterruptedException {
        DropdownPage.setUp();
    }

}
