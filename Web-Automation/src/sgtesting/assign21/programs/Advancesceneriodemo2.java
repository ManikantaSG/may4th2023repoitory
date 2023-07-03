package sgtesting.assign21.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Advancesceneriodemo2 {
	public Advancesceneriodemo2(WebDriver o)
	{

		PageFactory.initElements(o, this);
	}
	//Create WebElement for UserName
	private  WebElement username;
	public WebElement getuserName()
	{
		return username;
	}
	//Create WebElement for password
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	//create WebElement for Login button
	@FindBy(xpath="//*[@id=\"loginButton\"]/div")
	private WebElement OLogin;
	public WebElement getLoginButton()
	{
		return OLogin;
	}
	//create WebElement for Flyoutwindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutwindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//create WebElement for createuser
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement user;
	public WebElement getuser()
	{
		return user;
	}

	@FindBy(xpath= "//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}
	private WebElement firstName;
	public WebElement firstname()
	{
		return firstName;
	}
	private WebElement lastName;
	public WebElement lastname()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement email()
	{
		return email;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement username()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}
	private WebElement passwordCopy;
	public WebElement passwordCopy()
	{
		return passwordCopy;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement Savecopy;
	public WebElement getSavecopy()
	{
		return Savecopy;
	}

	//Create webelement for Logoutasadmin
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutasadmin()
	{
		return oLogout;
	}

	//create webelement user1login
	@FindBy(xpath="//*[@id=\"username\"]")
	private WebElement use;
	public WebElement getu()
	{
		return use;
	}
	@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
	private WebElement pa;
	public WebElement getpas()
	{
		return pa;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lo;
	public WebElement getlo()
	{
		return lo;
	}
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement exp;
	public WebElement getexp()
	{
		return exp;
	}
	//create webelement for createuser2
	@FindBy(xpath= "//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser1;
	public WebElement getadduser1()
	{
		return adduser1;
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement firstname1()
	{
		return userDataLightBox_firstNameField;
	}
	private WebElement userDataLightBox_lastNameField;
	public WebElement lastname1()
	{
		return userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;
	public WebElement email1()
	{
		return userDataLightBox_emailField;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
	private WebElement userna ;
	public WebElement username1()
	{
		return userna;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement getpassword1()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement passwordCopy1()
	{
		return userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement Savecopy1;
	public WebElement getSavecopy1()
	{
		return Savecopy1;
	}

	//Create webelement for Logoutasuser1
	@FindBy(linkText="Logout")
	private WebElement Logoutu1;
	public WebElement getLogoutasu1()
	{
		return Logoutu1;
	}
	//Create webelement for Loginasuser2
	@FindBy(xpath="//*[@id=\"username\"]")
	private WebElement use2;
	public WebElement getu2()
	{
		return use2;
	}
	@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
	private WebElement pa2;
	public WebElement getpas2()
	{
		return pa2;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lo2;
	public WebElement getlo2()
	{
		return lo2;
	}
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement exp2;
	public WebElement getexp2()
	{
		return exp2;
	}

	//create webelement createuser3
	@FindBy(xpath= "//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser2;
	public WebElement getadduser2()
	{
		return adduser1;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_firstNameField\']")
	private WebElement fir;
	public WebElement firstname2()
	{
		return fir;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
	private WebElement las;
	public WebElement lastname2()
	{
		return las;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement em;
	public WebElement email2()
	{
		return em;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
	private WebElement usernam;
	public WebElement username2()
	{
		return usernam;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement pas;
	public WebElement getpassword2()
	{
		return pas;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement pasc;
	public WebElement passwordCopy2()
	{
		return pasc;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement Savecopy2;
	public WebElement getSavecopy2()
	{
		return Savecopy2;
	}

	//Create webelement for Logoutasuser2
			@FindBy(linkText="Logout")
			private WebElement Logoutu2;
			public WebElement getLogoutasu2()
			{
				return Logoutu2;
			}
			
			//Create webelement for Loginasuser3
			@FindBy(xpath="//*[@id=\"username\"]")
			private WebElement use3;
			public WebElement getu3()
			{
				return use;
			}
			@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
			private WebElement pa3;
			public WebElement getpas3()
			{
				return pa;
			}
			@FindBy(xpath="//div[text()='Login ']")
			private WebElement lo3;
			public WebElement getlo3()
			{
				return lo3;
			}
			@FindBy(xpath="//span[text()='Start exploring actiTIME']")
			private WebElement exp3;
			public WebElement getexp3()
			{
				return exp3;
			}
			//Create webelement for Logoutasuser3
			@FindBy(linkText="Logout")
			private WebElement Logoutu3;
			public WebElement getLogoutasu3()
			{
				return Logoutu3;
			}
			
			//Create webelement for Loginasuser2
			@FindBy(xpath="//*[@id=\"username\"]")
			private WebElement user2;
			public WebElement getuse2()
			{
				return user2;
			}
			@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
			private WebElement pas2;
			public WebElement getpasw2()
			{
				return pas2;
			}
			@FindBy(xpath="//div[text()='Login ']")
			private WebElement log2;
			public WebElement getlog2()
			{
				return log2;
			}
			@FindBy(xpath="//span[text()='Start exploring actiTIME']")
			private WebElement expl2;
			public WebElement getexpl2()
			{
				return expl2;
			}




}
