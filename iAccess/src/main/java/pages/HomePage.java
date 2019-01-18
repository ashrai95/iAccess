package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	AndroidDriver<WebElement> driver;
	
	public HomePage(AndroidDriver<WebElement> driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

  @AndroidFindBy(id="com.iaccess:id/rlSearchBox")
  public AndroidElement searchbox;

  @AndroidFindBy(id="com.iaccess:id/rlSearchBox")
  public AndroidElement seeall;

  @AndroidFindBy(id="com.iaccess:id/rlSearchBox")
  public AndroidElement explore;

  @AndroidFindBy(id="com.iaccess:id/rlSearchBox")
  public AndroidElement profile;

  @AndroidFindBy(id="com.iaccess:id/rlSearchBox")
  public AndroidElement favorites;

@AndroidFindBy(id="com.iaccess:id/rlSearchBox")
public AndroidElement settings;

@AndroidFindBy(id="com.iaccess:id/rlSearchBox")
public AndroidElement restaurants;

@AndroidFindBy(id="com.iaccess:id/rlSearchBox")
public AndroidElement shoppingcenters;

@AndroidFindBy(id="com.iaccess:id/rlSearchBox")
public AndroidElement coffeeshops;

@AndroidFindBy(id="com.iaccess:id/rlSearchBox")
public AndroidElement bars;

@AndroidFindBy(id="com.iaccess:id/rlSearchBox")
public AndroidElement sportingvenues;

@AndroidFindBy(id="com.iaccess:id/rlSearchBox")
public AndroidElement parks;

@AndroidFindBy(id="com.iaccess:id/rlSearchBox")
public AndroidElement museum;

@AndroidFindBy(id="com.iaccess:id/rlSearchBox")
public AndroidElement supermarket;

}


