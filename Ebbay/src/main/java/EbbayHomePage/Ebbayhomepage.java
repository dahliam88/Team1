package EbbayHomePage;

import common.CommonAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Ebbayhomepage {

    @FindBy(how = How.ID_OR_NAME, using = "gh-ac")
    WebElement searchbox;

    @FindBy(how = How.ID_OR_NAME, using = "gh-btn")
    WebElement searchbtn;

    @FindBy(how = How.ID, using = "gh-cat-box")
    WebElement allcatagories;

    public void searchUp(String query) {
        searchbox.sendKeys(query);
        allcatagories.click();
        searchbtn.click();

    }
}
