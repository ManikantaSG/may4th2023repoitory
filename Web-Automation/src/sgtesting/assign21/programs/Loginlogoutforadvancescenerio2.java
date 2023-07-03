package sgtesting.assign21.programs;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Loginlogoutforadvancescenerio2{

	public static WebDriver oBrowser=null;
	public static Actipage1 oPage=null;
	public static void main(String[] args) {
		
			launchBrowser();
			navigate();
			login("admin","manager");
			minimizeFlyoutWindow();
			gotoUsersLink();
			createUser("User1","Demo1","user1demo@gmail.com","User1Demo1","WelcomeUser1");
			logout();
			login("User1Demo1","WelcomeUser1");
			welcomeToActiTime();
			gotoUsersLink();
			createUser("User2","Demo2","user2demo@gmail.com","User2Demo2","WelcomeUser2");
			logout();
			login("User2Demo2","WelcomeUser2");
			welcomeToActiTime();
			gotoUsersLink();
			createUser("User3","Demo3","user3demo@gmail.com","User3Demo3","WelcomeUser3");
			logout();
			login("User3Demo3","WelcomeUser3");
			welcomeToActiTime();
			logout();
			login("User2Demo2","WelcomeUser2");
			gotoUsersLink();
			user3LinkFromUsersList();
			modifyUser("WelcomeAgainUser3");
			logout();
			login("User3Demo3","WelcomeAgainUser3");
			logout();
			login("User1Demo1","WelcomeUser1");
			gotoUsersLink();
			user2LinkFromUsersList();
			modifyUser("WelcomeAgainUser2");
			logout();
			login("User2Demo2","WelcomeAgainUser2");
			logout();
			login("admin","manager");
			gotoUsersLink();
			user1LinkFromUsersList();
			modifyUser("WelcomeAgainUser1");
			logout();
			login("User1Demo1","WelcomeAgainUser1");
			logout();
			login("User2Demo2","WelcomeAgainUser2");
			gotoUsersLink();
			user3LinkFromUsersList();
			deleteUser();
			logout();
			login("User1Demo1","WelcomeAgainUser1");
			gotoUsersLink();
			user2LinkFromUsersList();
			deleteUser();
			logout();
			login("admin","manager");
			gotoUsersLink();
			user1LinkFromUsersList();
			deleteUser();
			logout();
			closeApplication();
		}

		private static void launchBrowser() 
		{
			try
			{
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();
				oPage=new Actipage1(oBrowser);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost/login.do");
				Thread.sleep(5000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

		private static void login(String userName, String password)
		{
			try
			{
				oPage.getUserName().sendKeys(userName);
				Thread.sleep(2000);
				oPage.getPassword().sendKeys(password);
				Thread.sleep(2000);
				oPage.getLoginButton().click();
				Thread.sleep(5000);			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void minimizeFlyoutWindow()
		{
			try
			{
				oPage.getFlyOutWindow().click();
				Thread.sleep(2000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void gotoUsersLink()
		{
			try
			{
				oPage.getUserLink().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}	
		}

		private static void createUser(String fn,String ln,String email,String un,String pwd)
		{
			try
			{
				oPage.getAddUserButton().click();
				Thread.sleep(2000);
				oPage.getFirstName().sendKeys(fn);
				Thread.sleep(2000);
				oPage.getLastName().sendKeys(ln);
				Thread.sleep(2000);
				oPage.getEmail().sendKeys(email);
				Thread.sleep(2000);
				oPage.getUserName().sendKeys(un);
				Thread.sleep(2000);
				oPage.getUserPassword().sendKeys(pwd);
				Thread.sleep(2000);
				oPage.getUserPasswordCopy().sendKeys(pwd);
				Thread.sleep(2000);
				oPage.getCreateUserButton().click();
				Thread.sleep(2000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void welcomeToActiTime()
		{
			try
			{
				oPage.getStartexploringactiTIME().click();
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}	
		}

		private static void user1LinkFromUsersList()
		{
			try
			{
				oPage.getUser1LinkFromList().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void user2LinkFromUsersList()
		{
			try
			{
				oPage.getUser2LinkFromList().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void user3LinkFromUsersList()
		{
			try
			{
				oPage.getUser3LinkFromList().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void modifyUser(String pwd)
		{
			try
			{
				oPage.getUserPassword().sendKeys(pwd);
				Thread.sleep(2000);
				oPage.getUserPasswordCopy().sendKeys(pwd);
				Thread.sleep(2000);
				oPage.getSaveChangesButton().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void deleteUser()
		{
			try
			{
				oPage.getDeleteUserButton().click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				Thread.sleep(2000);
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void logout()
		{
			try
			{
				oPage.getLogoutButton().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void closeApplication()
		{
			try
			{
				oBrowser.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
}
