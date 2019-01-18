package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignIn {
	
	AndroidDriver<WebElement> driver;
	
	public SignIn(AndroidDriver<WebElement> driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.iaccess:id/login_email_input")
	public AndroidElement email;
	
	@AndroidFindBy(id="com.iaccess:id/etLoginPassword")
	public AndroidElement password;
	
	@AndroidFindBy(id="com.iaccess:id/imgEyeIconLoginPassword")
	public AndroidElement eyeicon;
	
	@AndroidFindBy(id="com.iaccess:id/btn_sign_in")
	public AndroidElement signin;
	
	@AndroidFindBy(id="com.iaccess:id/tvSignInForgotPassword")
	public AndroidElement forgotpassword;
	
	@AndroidFindBy(id="com.iaccess:id/short_link_to_sign_up")
	public AndroidElement signup;
	
	@AndroidFindBy(id="com.iaccess:id/rlFacebook")
	public AndroidElement fbsignin;
	
	@AndroidFindBy(id="com.iaccess:id/rlGoogle")
	public AndroidElement googlesignin;
	
	@AndroidFindBy(id="com.iaccess:id/tv_explore_sign_in")
	public AndroidElement explore;
	
	@AndroidFindBy(id="com.iaccess:id/home_sign_in")
	public AndroidElement back;
	
	public boolean signintoapp(String emaildata, String passworddata)
	{
		try
		{
			AndroidTouchAction ata = new AndroidTouchAction(driver);
			email.sendKeys(emaildata);
			password.sendKeys(passworddata);
			signin.click();
			return true;
		}
		catch(Exception e) 
		{
			System.out.println("Exception in method : signintoapp - Class : Signin" + e);
			return false;
		}
	}
}
