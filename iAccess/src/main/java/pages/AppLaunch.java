package pages;

//import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AppLaunch {
	
//public AndroidDriver<AndroidElement> driver;	
	
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


}
