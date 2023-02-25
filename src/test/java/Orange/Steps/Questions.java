package Orange.Steps;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.annotation.Internal;
import org.openqa.selenium.TakesScreenshot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.ibm.icu.text.SimpleDateFormat;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.OutputType;

public class Questions {

	private WebDriver driver;

	public Questions(WebDriver driver) {
		this.driver = driver;


	}

	@Step
	public void screenShot() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File dest = new File("C:\\Users\\luisa.hernandez\\Documents\\Capturas\\curso\\" + filename + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	//@Step
	public void tiempoSegundos(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}