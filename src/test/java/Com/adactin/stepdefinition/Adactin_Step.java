package Com.adactin.stepdefinition;

import org.bouncycastle.crypto.prng.ThreadedSeedGenerator;
import org.junit.runner.Runner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Com.adactin.runner.Adactin_Runner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_Step {

	public static WebDriver driver = Adactin_Runner.driver;
	

	@Given("^lanch The Adactin Web Application$")
	public void lanch_The_Adactin_Web_Application() throws Throwable {

		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Valid User Name In User Name Feild$")
	public void user_Enter_The_Valid_User_Name_In_User_Name_Feild() throws Throwable {

		WebElement Username = driver.findElement(By.xpath("//input[@type='text']"));
		Username.sendKeys("welcomemark");
	}

	@When("^user Enter The Valid Password In PassWord Feild$")
	public void user_Enter_The_Valid_Password_In_PassWord_Feild() throws Throwable {
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("sherif123");
	}

	@Then("^user Click The Login Button Should Be Navigate To Search Hotel Page$")
	public void user_Click_The_Login_Button_Should_Be_Navigate_To_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
	}

	@When("^user Select The Location In Select Feild$")
	public void user_Select_The_Location_In_Select_Feild() throws Throwable {
		

		WebElement hot_loc = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(hot_loc);
		s.selectByIndex(5);
	}

	@When("^user Select The Hotel In Select Feild$")
	public void user_Select_The_Hotel_In_Select_Feild() throws Throwable {
		WebElement hot_name = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hot_name);
		s1.selectByIndex(4);
	}

	@When("^user Select The Room Type In Select Feild$")
	public void user_Select_The_Room_Type_In_Select_Feild() throws Throwable {
		WebElement room_type = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(room_type);
		s2.selectByIndex(4);
	}

	@When("^user Select The Number Of Rooms In Select Feild$")
	public void user_Select_The_Number_Of_Rooms_In_Select_Feild() throws Throwable {
		WebElement room_nos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(room_nos);
		s3.selectByIndex(4);
	}

	@When("^user Enter Cheack In Date The Input Feild$")
	public void user_Enter_Cheack_In_Date_The_Input_Feild() throws Throwable {
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("25/03/2024");
	}

	@When("^user Enter Cheack Out Date The Input Feild$")
	public void user_Enter_Cheack_Out_Date_The_Input_Feild() throws Throwable {
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("26/04/2024");

	}

	@When("^user Select The Adults Per Room In Select Feild$")
	public void user_Select_The_Adults_Per_Room_In_Select_Feild() throws Throwable {
		WebElement adult_room = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(adult_room);
		s4.selectByIndex(4);
	}

	@When("^user Select The Children Per Room In Select Feild$")
	public void user_Select_The_Children_Per_Room_In_Select_Feild() throws Throwable {
		WebElement child_room = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s4 = new Select(child_room);
		s4.selectByIndex(4);
	  
	}

	@Then("^user Click The Search Button It Shoud Be Navigate To Select Hotels Page$")
	public void user_Click_The_Search_Button_It_Shoud_Be_Navigate_To_Select_Hotels_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {

		driver.findElement(By.xpath("//input[@name=\"radiobutton_0\"]")).click();
	}

	@Then("^user Click The Continue Button It Navigate to Book A Hotel Page$")
	public void user_Click_The_Continue_Button_It_Navigate_to_Book_A_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}

	@When("^user Enter The First Name In InPut Feild$")
	public void user_Enter_The_First_Name_In_InPut_Feild() throws Throwable {
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Mark");
	}

	@When("^user Enter The Last Name In Input Feild$")
	public void user_Enter_The_Last_Name_In_Input_Feild() throws Throwable {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Antony");

	}

	@When("^user Enter The Builldind Address In Input Feild$")
	public void user_Enter_The_Builldind_Address_In_Input_Feild() throws Throwable {
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Under The Sky");
	}

	@When("^user Enter The Credit Card No In Input Feild$")
	public void user_Enter_The_Credit_Card_No_In_Input_Feild() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123412");
	}

	@When("^user Select He credit Card Type In Select Feild$")
	public void user_Select_He_credit_Card_Type_In_Select_Feild() throws Throwable {
		WebElement card_type = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s5 = new Select(card_type);
		s5.selectByValue("MAST");
	}

	@When("^user Select The Expiry Month In Expiry Date  Select Feild$")
	public void user_Select_The_Expiry_Month_In_Expiry_Date_Select_Feild() throws Throwable {
		WebElement exp_mon = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s6 = new Select(exp_mon);
		s6.selectByValue("5");

	}

	@When("^user Select The Expiry Year In Expiry Date Select Feild$")
	public void user_Select_The_Expiry_Year_In_Expiry_Date_Select_Feild() throws Throwable {
		WebElement exp_year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s7 = new Select(exp_year);
		s7.selectByValue("2015");
	}

	@When("^user Enter The CVV Number In InPut Feild$")
	public void user_Enter_The_CVV_Number_In_InPut_Feild() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("1234");
	}

	@Then("^User Click The Book Now Button It Navigate To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_It_Navigate_To_Booking_Confirmation_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='button']")).click();
	}

	@Then("^user Click The Logout Button It Navigate To Logout SuccessFully LogOut Page$")
	public void user_Click_The_Logout_Button_It_Navigate_To_Logout_SuccessFully_LogOut_Page() throws Throwable {
		
		driver.findElement(By.id("logout")).click();
	}

	@Then("^user Click The Login Again Link It Navigate To Login Page$")
	public void user_Click_The_Login_Again_Link_It_Navigate_To_Login_Page() throws Throwable {
		
		driver.findElement(By.xpath("//a[@href='index.php']")).click();

	}

}
