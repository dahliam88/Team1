package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Yahoohomepage extends CommonAPI {
    @FindBy(how = How.ID, using = "uh-search-button")
    WebElement searchbox;

    @FindBy(how = How.CLASS_NAME, using = "rapid-noclick-resp")
     WebElement searchBtn;

    public void searchUp(String query) {
        searchbox.sendKeys(query);
        searchBtn.click();
    }


}
