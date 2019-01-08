package br.co.figueira;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;




public class BaseTest {
	
	@Rule
	public TestName testName = new TestName();
	
	@After
	public void encerrar() throws IOException {
		
		
		TakesScreenshot ss = (TakesScreenshot) DriveFactory.getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + 
				"ss" + File.separator + 
				testName.getMethodName() + ".jpg"));
		
		if(Properties.CLOSE_BROWSER) {
		DriveFactory.killDriver();
		}
	}

}
