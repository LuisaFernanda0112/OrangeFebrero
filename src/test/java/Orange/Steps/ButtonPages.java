package Orange.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
    @FindBy(how = How.XPATH, using = "//button[@type = 'submit']")
    public WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//a[@href='/web/index.php/pim/viewPimModule']")
    public WebElement btnPim;

    @FindBy(how = How.XPATH, using = "//input[@placeholder= 'First Name']")
    public WebElement getTxtFirstName;

    @FindBy(how = How.XPATH, using = "//input[@placeholder= 'Middle Name']")
    public WebElement MiddleName;

    @FindBy(how = How.XPATH, using = "//input[@placeholder= 'Last Name']")
    public WebElement txtLastName;

    public ButtonPages (WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void btnLogin(){
        btnLogin.isDisplayed();
        btnLogin.click();
    }

    public void btnPim(){
    btnPim.isDisplayed();
    btnPim.click();
    }
}
