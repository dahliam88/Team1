package TestEbbayhomepage;

import EbbayHomePage.Ebbayhomepage;
import common.CommonAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestEbbayHomePage  extends CommonAPI {

    @Test
    public void testSearchUp() {
        Ebbayhomepage ebbayhomepage= PageFactory.initElements(driver, Ebbayhomepage.class);
        ebbayhomepage.searchUp("Books");
        ebbayhomepage.searchUp("Baby");
    }
}
