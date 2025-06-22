package org.automation;

import org.automation.coupons.SocialMediaPage;
import org.testng.annotations.Test;

public class SocialMediaPageTest {

    SocialMediaPage SocialMediaPage = new SocialMediaPage();

    @Test
    public void verifyContactNewsPage() {
        SocialMediaPage.setUp();

    }
}
