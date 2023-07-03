package sgtesting.assign21.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Advancescenerio1 {
	public Advancescenerio1(WebDriver o)
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


	@FindBy(xpath= "//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser2;
	public WebElement getadduser2()
	{
		return adduser2;
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
	//Create webelement for Logoutasadmin
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutasadmin()
	{
		return oLogout;
	}
	//Create webelement for Loginasuser1
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
		
		@FindBy(xpath="//*[@id=\"username\"]")
		private  WebElement userad;
		public WebElement getuserad()
		{
			return userad;
		}
		//Create WebElement for password
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pwd1;
		public WebElement getPasswo()
		{
			return pwd1;
		}
		//create WebElement for Login button
		@FindBy(xpath="//*[@id=\"loginButton\"]/div")
		private WebElement Login;
		public WebElement getLogin()
		{
			return Login;
		}
		@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
		private WebElement user1;
		public WebElement getuser1()
		{
			return user1;
		}
		@FindBy(xpath="//span[text()='user1, demo1']")
        private  WebElement userco1;
		public WebElement getuserco()
		{
			return userco1;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pas1;
		public WebElement getpassword3()
		{
			return pas1;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pas2;
		public WebElement getpassword4()
		{
			return pas2;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
		private WebElement pasc1;
		public WebElement passwordCopy3()
		{
			return pasc1;
		}
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement Savecopy3;
		public WebElement getSavecopy3()
		{
			return Savecopy3;
		}
		
		
		@FindBy(xpath="//span[text()='user2, demo2']")
        private  WebElement userco2;
		public WebElement getuserco1()
		{
			return userco2;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pas4;
		public WebElement getpassword6()
		{
			return pas4;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pas3;
		public WebElement getpassword5()
		{
			return pas3;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
		private WebElement pasc2;
		public WebElement passwordCopy4()
		{
			return pasc2;
		}
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement Savecopy4;
		public WebElement getSavecopy4()
		{
			return Savecopy4;
		}
		
		@FindBy(xpath="//span[text()='user3, demo3']")
        private  WebElement userc2;
		public WebElement getuserco2()
		{
			return userc2;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pasw1;
		public WebElement getpasswor3()
		{
			return pasw1;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pasw2;
		public WebElement getpasswor4()
		{
			return pasw2;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
		private WebElement pasco1;
		public WebElement passwordCop3()
		{
			return pasco1;
		}
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement Savecop3;
		public WebElement getSavecop3()
		{
			return Savecop3;
		}
		//Create webelement for Logoutasadmin
		@FindBy(linkText="Logout")
		private WebElement Logout;
		public WebElement getLogoutasadmi()
		{
			return Logout;
		}
		
		//Create webelement for Loginasuser1
		@FindBy(xpath="//*[@id=\"username\"]")
		private WebElement use1;
		public WebElement getu1()
		{
			return use1;
		}
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pa1;
		public WebElement getpas1()
		{
			return pa1;
		}
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement lo1;
		public WebElement getlo1()
		{
			return lo1;
		}
		
		@FindBy(linkText="Logout")
		private WebElement Logoutu4;
		public WebElement getLogoutasu4()
		{
			return Logoutu4;
		}
		
		@FindBy(xpath="//*[@id=\"username\"]")
		private WebElement us3;
		public WebElement getu4()
		{
			return us3;
		}
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pa4;
		public WebElement getpas4()
		{
			return pa4;
		}
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement lo4;
		public WebElement getlo4()
		{
			return lo4;
		}
		@FindBy(linkText="Logout")
		private WebElement Logoutu5;
		public WebElement getLogoutasu5()
		{
			return Logoutu5;
		}
		
		@FindBy(xpath="//*[@id=\"username\"]")
		private WebElement us4;
		public WebElement getu5()
		{
			return us4;
		}
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pa5;
		public WebElement getpas5()
		{
			return pa5;
		}
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement lo5;
		public WebElement getlo5()
		{
			return lo5;
		}
		@FindBy(linkText="Logout")
		private WebElement Logoutu6;
		public WebElement getLogoutasu6()
		{
			return Logoutu6;
		}
		
		@FindBy(xpath="//*[@id=\"username\"]")
		private  WebElement userad1;
		public WebElement getuserad1()
		{
			return userad;
		}
		//Create WebElement for password
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pwd2;
		public WebElement getPasswo1()
		{
			return pwd2;
		}
		//create WebElement for Login button
		@FindBy(xpath="//*[@id=\"loginButton\"]/div")
		private WebElement Login1;
		public WebElement getLogin1()
		{
			return Login1;
		}
		
		@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
		private WebElement user2;
		public WebElement getuser2()
		{
			return user2;
		}
		
		//create webelement for delete
		@FindBy(xpath="//span[text()='user1, demo1']")
        private  WebElement userco3;
		public WebElement getuserco3()
		{
			return userco3;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getdelete()
		{
			return userDataLightBox_deleteBtn;
		}
		
		@FindBy(xpath="//span[text()='user2, demo2']")
        private  WebElement userco4;
		public WebElement getuserco4()
		{
			return userco4;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
		private WebElement delete1;
		public WebElement getdelete1()
		{
			return delete1;
		}
		
		@FindBy(xpath="//span[text()='user3, demo3']")
        private  WebElement userco5;
		public WebElement getuserco5()
		{
			return userco5;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
		private WebElement delete2;
		public WebElement getdelete2()
		{
			return delete2;
		}
		
		//create WebElement for Logoutlink()
		@FindBy(linkText="Logout")
		private WebElement o1Logout;
		public WebElement getLogoutButton()
		{
			return o1Logout;
		}
		 //create WebElement for Close()	
		private WebElement close;
		public WebElement Close()
		{
			return close;
		}
		
}
