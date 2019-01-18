package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppLaunch {
	
	AndroidDriver<WebElement> driver;
	
	public AppLaunch(AndroidDriver<WebElement> driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


@AndroidFindBy(id="com.iaccess:id/tvSignIn")
public AndroidElement signin; 
	
@AndroidFindBy(id="com.iaccess:id/tvSignUp")
public AndroidElement signup;

@AndroidFindBy(id="com.iaccess:id/rlFacebook")
public AndroidElement fbsignin;

@AndroidFindBy(id="com.iaccess:id/rlGoogle")
public AndroidElement googlesignin;

@AndroidFindBy(id="com.iaccess:id/llExplore")
public AndroidElement explore;


    public boolean clicksignin()
    {
    	try {
             AndroidTouchAction ata = new AndroidTouchAction(driver);
             signin.click();
             return true;
    	}
    	catch(Exception e) {
    		System.out.println("Exception in method : clicksignin" + e);
    		return false;
    	}
    }
    
    public boolean clicksignup()
    {
    	try {
             AndroidTouchAction ata = new AndroidTouchAction(driver);
             signup.click();
             return true;
    	}
    	catch(Exception e) {
    		System.out.println("Exception in method : clicksignin" + e);
    		return false;
    	}
    }
    
    public boolean clickexplore()
    {
    	try {
             AndroidTouchAction ata = new AndroidTouchAction(driver);
             explore.click();
             return true;
    	}
    	catch(Exception e) {
    		System.out.println("Exception in method : clicksignin" + e);
    		return false;
    	}
    }
    
    public boolean clickfbsignin()
    {
    	try {
             AndroidTouchAction ata = new AndroidTouchAction(driver);
             fbsignin.click();
             return true;
    	}
    	catch(Exception e) {
    		System.out.println("Exception in method : clicksignin" + e);
    		return false;
    	}
    }
    
    public boolean clickgooglesignin()
    {
    	try {
             AndroidTouchAction ata = new AndroidTouchAction(driver);
             googlesignin.click();
             return true;
    	}
    	catch(Exception e) {
    		System.out.println("Exception in method : clicksignin" + e);
    		return false;
    	}
    }
}



