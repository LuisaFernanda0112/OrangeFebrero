package Pages;

import Orange.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class PimPage  {

    private ButtonPages buttonPages;
       public PimPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
    }

    public void tearAddEmployee()
    {
        buttonPages.btnPim ();
        buttonPages.btnAddEmployee();
       }
    {
        public void fillOutAddEmployee(){
        txtfirstName.isDisplayed;
         txtfirstName.SendKeys(firstName);
        txtMiddle.sendKeys (Middle);
        txtlastName.SendKeys(lastName);

    }

    }

}
