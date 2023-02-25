package Orange.Definitions;

import Pages.LoginPage;
import Pages.PimPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import Orange.Steps.Conexion;
import io.cucumber.java.en.Given;

import java.sql.SQLException;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);

	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}


// identifica la variable (.*) expresiones regulares
	 @When("^the user fill out user name (.*) and password (.*)$")
	public void fillOutLogin (String userName, String pass )  throws SQLException {
		this.loginPage = new LoginPage(driver);
		this.loginPage.fillOutLogin(userName, pass);

	 }
	@When("^the user access to the add employee (.*)$")
	public void tearAddEmployee(){
    this.pimPage = new PimPage(driver);
	this.pimPage.tearAddEmployee();

	}
	@When("^the user fill out field first (.*)$ middle  (.*)$  last name(.*)$")
	public void tearAddEmployee(){
		this.pimPage = new PimPage(driver);
		this.pimPage.tearAddEmployee();
}