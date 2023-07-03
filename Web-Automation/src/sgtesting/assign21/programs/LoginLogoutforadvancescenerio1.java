package sgtesting.assign21.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutforadvancescenerio1 {
	public static WebDriver l=null;
	public static Advancescenerio1 opage=null;
	public static void main(String[] args) {
		launch();
		navigate();
		Login();
		Minimize();
		CreateUser();Logoutasaadmin();
		Loginasu1(); Logoutasu1();
		Loginasu2(); Logoutasu2();
		Loginasu3(); Logoutasu3();
		Loginasadmin();
		Modifyu1();   Logoutasaadmi();
		Loginasuse1(); Logoutasuse1();
		Loginasuse2(); Logoutasus1();
		Loginasuse3(); Logoutasu();
		Loginasadmin1();
		deleteu1();  Logoutasadmin();
		Close();
	}
	private static void launch()
	{
		try {
			l=new ChromeDriver();
			opage=new Advancescenerio1(l);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try {
			l.get("http://localhost:80/login.do");
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try {
			opage.getuserName().sendKeys("admin");
			Thread.sleep(2000);
			opage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			opage.getLoginButton().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Minimize()
	{
		try {
			opage.getFlyOutwindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CreateUser()
	{
		try {
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.firstname().sendKeys("demo1");
			Thread.sleep(2000);
			opage.lastname().sendKeys("user1");
			Thread.sleep(2000);
			opage.email().sendKeys("mani38@gmail.com");
			Thread.sleep(2000);
			opage.username().sendKeys("suman");
			Thread.sleep(2000);
			opage.getpassword().sendKeys("1234");
			Thread.sleep(2000);
			opage.passwordCopy().sendKeys("1234");
			Thread.sleep(2000);
			opage.getSavecopy().click();
			Thread.sleep(4000);
			
			opage.getadduser1().click();
			Thread.sleep(2000);
			opage.firstname1().sendKeys("demo2");
			Thread.sleep(2000);
			opage.lastname1().sendKeys("user2");
			Thread.sleep(2000);
			opage.email1().sendKeys("mani65@gmail.com");
			Thread.sleep(2000);
			opage.username1().sendKeys("mani");
			Thread.sleep(2000);
			opage.getpassword1().sendKeys("2468");
			Thread.sleep(2000);
			opage.passwordCopy1().sendKeys("2468");
			Thread.sleep(2000);
			opage.getSavecopy1().click();
			Thread.sleep(2000); 

			opage.getadduser2().click();
			Thread.sleep(2000);
			opage.firstname2().sendKeys("demo3");
			Thread.sleep(2000);
			opage.lastname2().sendKeys("user3");
			Thread.sleep(2000);
			opage.email1().sendKeys("mani651@gmail.com");
			Thread.sleep(2000);
			opage.username2().sendKeys("shivu");
			Thread.sleep(2000);
			opage.getpassword2().sendKeys("3456");
			Thread.sleep(2000);
			opage.passwordCopy1().sendKeys("3456");
			Thread.sleep(2000);
			opage.getSavecopy2().click();
			Thread.sleep(2000); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logoutasaadmin()
	{
		try {
			opage.getLogoutasadmin().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Loginasu1()
	{
		try {
			opage.getu().sendKeys("suman");
			Thread.sleep(2000);
			opage.getpas().sendKeys("1234");
			Thread.sleep(2000);
			opage.getlo().click();
			Thread.sleep(2000);	
			opage.getexp().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logoutasu1()
	{
		try {
			opage.getLogoutasu1().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void Loginasu2()
	{
		try {
			opage.getu2().sendKeys("mani");
			Thread.sleep(2000);
			opage.getpas2().sendKeys("2468");
			Thread.sleep(2000);
			opage.getlo2().click();
			Thread.sleep(2000);	
			opage.getexp2().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logoutasu2()
	{
		try {
			opage.getLogoutasu2().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void Loginasu3()
	{
		try {
			opage.getu3().sendKeys("shivu");
			Thread.sleep(2000);
			opage.getpas3().sendKeys("3456");
			Thread.sleep(2000);
			opage.getlo3().click();
			Thread.sleep(2000);	
			opage.getexp3().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logoutasu3()
	{
		try {
			opage.getLogoutasu3().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Loginasadmin()
	{
		try {
			opage.getuserad().sendKeys("admin");
			Thread.sleep(2000);
			opage.getPasswo().sendKeys("manager");
			Thread.sleep(2000);
			opage.getLogin().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Modifyu1()
	{
		try {
			opage.getuser1().click();
			Thread.sleep(2000);
			opage.getuserco().click();
			Thread.sleep(2000);
			opage.getpassword3().clear();
			Thread.sleep(2000);
			opage.getpassword4().sendKeys("5678");
			Thread.sleep(2000);
			opage.passwordCopy3().sendKeys("5678");
			Thread.sleep(2000);
			opage.getSavecopy3().click();
			Thread.sleep(4000);

			opage.getuserco1().click();
			Thread.sleep(2000);
			opage.getpassword6().clear();
			Thread.sleep(2000);
			opage.getpassword5().sendKeys("samp");
			Thread.sleep(2000);
			opage.passwordCopy4().sendKeys("samp");
			Thread.sleep(2000);
			opage.getSavecopy4().click();
			Thread.sleep(4000);

			opage.getuserco2().click();
			Thread.sleep(2000);
			opage.getpasswor3().clear();
			Thread.sleep(2000);
			opage.getpasswor4().sendKeys("manj");
			Thread.sleep(2000);
			opage.passwordCop3().sendKeys("manj");
			Thread.sleep(2000);
			opage.getSavecop3().click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logoutasaadmi()
	{
		try {
			opage.getLogoutasadmi().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	private static void Loginasuse1()
	{
		try {
			opage.getu4().sendKeys("suman");
			Thread.sleep(2000);
			opage.getpas4().sendKeys("5678");
			Thread.sleep(2000);
			opage.getlo4().click();
			Thread.sleep(2000);	


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logoutasuse1()
	{
		try {
			opage.getLogoutasu5().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void Loginasuse2()
	{
		try {
			opage.getu5().sendKeys("mani");
			Thread.sleep(2000);
			opage.getpas5().sendKeys("samp");
			Thread.sleep(2000);
			opage.getlo5().click();
			Thread.sleep(2000);	

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logoutasus1()
	{
		try {
			opage.getLogoutasu6().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Loginasuse3()
	{
		try {
			opage.getu5().sendKeys("shivu");
			Thread.sleep(2000);
			opage.getpas5().sendKeys("manj");
			Thread.sleep(2000);
			opage.getlo5().click();
			Thread.sleep(2000);	

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logoutasu()
	{
		try {
			opage.getLogoutasu6().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void Loginasadmin1()
	{
		try {
			opage.getuserad1().sendKeys("admin");
			Thread.sleep(2000);
			opage.getPasswo1().sendKeys("manager");
			Thread.sleep(2000);
			opage.getLogin1().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteu1()
	{
		try {
			opage.getuser2().click();
			Thread.sleep(2000);
			opage.getuserco3().click();
			Thread.sleep(2000);
			opage.getdelete().click();
			Thread.sleep(2000);
			l.switchTo().alert().accept();
			Thread.sleep(2000);
			
			opage.getuserco4().click();
			Thread.sleep(2000);
			opage.getdelete1().click();
			Thread.sleep(2000);
			l.switchTo().alert().accept();
			Thread.sleep(2000);
			
			opage.getuserco5().click();
			Thread.sleep(2000);
			opage.getdelete2().click();
			Thread.sleep(2000);
			l.switchTo().alert().accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Logoutasadmin()
	{
		try {
			opage.getLogoutButton().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			l.close();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
