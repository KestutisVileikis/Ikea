package lt.kestutis.pom.pages.test.ikea;

import lt.kestutis.pom.pages.ikea.Common;
import org.testng.annotations.AfterTest;

public class TestBase {
    @AfterTest
    public void teardown() {

        Common.closeDriver();
    }
}
