package Test;

import Homepage.FacebookHome;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestFacebook extends CommonAPI {

    @Test
    public void testLogin() {
        FacebookHome facebookHome = PageFactory.initElements(driver, FacebookHome.class);
        facebookHome.loginFB("dahliam@live.com", "abc123");
    }

}
