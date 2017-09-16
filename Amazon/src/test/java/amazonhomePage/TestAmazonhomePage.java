package amazonhomePage;

import AmazonhomePage.amazonhomepage;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAmazonhomePage extends CommonAPI {

    @Test

    public void  testSearchUP(){
     amazonhomepage amazonHome = PageFactory.initElements(driver,amazonhomepage.class );
     amazonHome.searchUP("Megaman Battlenework 3 ");

    }

}
