package com.UrbanLadderC.ResuableComponents;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	
	
	public static void Implicitwait(WebDriver driver) throws IOException
	{
	
		int wait=Integer.parseInt(Base.prop.getProperty("waits"));
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}

	
	
	
}
