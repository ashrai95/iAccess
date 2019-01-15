package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUp {
	
	@AndroidFindBy(id="com.iaccess:id/home_sign_in")
    public AndroidElement back;

	@AndroidFindBy(id="com.iaccess:id/tv_explore_sign_in")
    public AndroidElement explore;

	@AndroidFindBy(id="com.iaccess:id/rlFacebook")
    public AndroidElement fbsignin;

	@AndroidFindBy(id="com.iaccess:id/rlGoogle")
    public AndroidElement googlesignin;

	@AndroidFindBy(id="com.iaccess:id/signup_first_name_input")
    public AndroidElement firstname;

	@AndroidFindBy(id="com.iaccess:id/signup_last_name_input")
    public AndroidElement lastname;

	@AndroidFindBy(id="com.iaccess:id/signup_email_input")
    public AndroidElement email;

	@AndroidFindBy(id="com.iaccess:id/etSignupPassword")
    public AndroidElement password;

	@AndroidFindBy(id="com.iaccess:id/imgEyeIconPasswordSignUp")
	public AndroidElement eyeiconpassword;
	
	@AndroidFindBy(id="com.iaccess:id/etSignupConfirmPassword")
    public AndroidElement confirmpassword;	
	
	@AndroidFindBy(id="com.iaccess:id/imgEyeIconConfirmPasswordSignUp")
	public AndroidElement eyeiconconfirmpassword;
	
	//user needs to swipe down page
	
	@AndroidFindBy(id="com.iaccess:id/tvAround")
    public AndroidElement getaround;

	@AndroidFindBy(id="com.iaccess:id/sign_up_checkbox")
    public AndroidElement checkbox;

	@AndroidFindBy(id="com.iaccess:id/btn_sign_up")
    public AndroidElement signup;
	
}
