package org.automation;

import org.automation.coupons.ContactPage;
import org.automation.coupons.LatestNewsPage;
import org.testng.annotations.Test;

public class ContactPageTest {

    ContactPage ContactPage = new ContactPage();
    @Test
    public  void verifyContactNewsPage() {
        ContactPage.setUp();

    }
}
