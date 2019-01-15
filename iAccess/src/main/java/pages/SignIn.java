package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignIn {
	
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
	
	
}
