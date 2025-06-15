package org.automation;

import org.edgeautomation.EdgePractice;
import org.testng.annotations.Test;

public class EdgePracticeTest {

    EdgePractice edgePractice = new EdgePractice ();
    @Test
    public void browserLaunchTest(){
        edgePractice.browserLaunch("chrome");
    }

}
