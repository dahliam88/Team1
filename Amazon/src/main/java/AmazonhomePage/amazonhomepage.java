package AmazonhomePage;

import common.CommonAPI;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class amazonhomepage extends CommonAPI {

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, using = "nav-input")
    WebElement searchBtn;

    public void searchUP(String query){
        searchBox.sendKeys(query);
        searchBtn.click();
    }

}



