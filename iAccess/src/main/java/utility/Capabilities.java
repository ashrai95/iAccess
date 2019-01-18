package utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Capabilities {

		
		public static AndroidDriver<WebElement> driver = null;
		
		public Capabilities()
		{
		//public static void main(String[] args) throws InterruptedException, MalformedURLException
			

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G888");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
			capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Ashish Rai\\Downloads\\iAccess-Android-staging.apk");
		   try {
			    driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		     }
		    catch(MalformedURLException e) {
			  e.printStackTrace();
		     }
		}
	
}