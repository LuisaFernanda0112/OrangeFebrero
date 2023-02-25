package Pages;

import Orange.DataBase.ConsultDataBase;
import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

//esto es una clase
public class LoginPage {
    //esto es un constructor

    private ButtonPages buttonPages;
    private ConsultDataBase consultDataBase;
    private Questions  questions;

    @FindBy (how = How.NAME, using = "username")
public WebElement inputUserName;

    @FindBy (how = How.NAME, using = "password")
    public WebElement inputPassword;


    public LoginPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }
//Esto es un Metodo
    public void fillOutLogin (String userName, String pass ) throws SQLException {
        inputUserName.isDisplayed();
        questions.screenShot();
        inputUserName.sendKeys(userName);
        inputPassword.sendKeys(pass);
        buttonPages.btnLogin ();
        questions.screenShot();
        consultDataBase.consultUsers();


    }
}
