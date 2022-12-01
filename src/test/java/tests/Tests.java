package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileElement;

public class Tests extends BaseClass{
	


	@Test
	public void Login_Page(){

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("Login_Page", "OPen the application");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		test1.log(Status.INFO, "Test One started");
		wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/btn_next")));
		MobileElement el1 = (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/btn_next");
		el1.click();
		mobileElement =  (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/btn_next");		
		wait.until(ExpectedConditions.visibilityOf(mobileElement));
		el1.click();
		test1.log(Status.PASS, "clicked on next Button");
		wait.until(ExpectedConditions.visibilityOf(mobileElement));
		el1.click();
		test1.log(Status.PASS, "clicked on next Button");
		wait.until(ExpectedConditions.visibilityOf(mobileElement));
		el1.click();
		test1.log(Status.PASS, "clicked on next Button");
		wait.until(ExpectedConditions.visibilityOf(mobileElement));
		el1.click();
		test1.log(Status.PASS, "clicked on next Button");
		wait.until(ExpectedConditions.visibilityOf(mobileElement));
		el1.click();
		test1.log(Status.PASS, "clicked on next Button");
		wait.until(ExpectedConditions.visibilityOf(mobileElement));
		el1.click();
		test1.log(Status.PASS, "clicked on next Button");
		wait.until(ExpectedConditions.visibilityOf(mobileElement));
		el1.click();
		
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[1]");
		wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[1]")));
		el4.click();
		wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));
		MobileElement el5 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
		el5.click();
		test1.log(Status.PASS, "Enter User ID");
		wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/etMobileNumber")));
		MobileElement el6 = (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/etMobileNumber");
		el6.click();
		el6.sendKeys("8879474700");
		test1.log(Status.PASS, "Enter Password");
		MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
		el7.sendKeys("quark@123");
		MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout");
		el8.click();
		test1.log(Status.PASS, "Click on SIgn In Button");
		starttime = System.currentTimeMillis();
		try {
			MobileElement el9 = (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/confirm_button");
			el9.click();
		} catch (Exception e) {}
		try {
			MobileElement me1 = (MobileElement) driver.findElementById("android:id/autofill_save_yes");
			me1.click();
		} catch (Exception e) {}
		test1.log(Status.PASS, "Wait Until Element Visible");
		wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/ivProfile")));
		endtime = System.currentTimeMillis();
		MobileElement result= (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_view_syllabus");
		Assert.assertEquals(result.getText(), "Attend Class");
		reponsetime = (endtime-starttime)/1000.0;
		test1.log(Status.INFO, "Test One completed");
	}

@Test(dependsOnMethods = {"Login_Page"})
public void Attend_Class_Page() throws InterruptedException {
	ExtentTest test2 = extent.createTest("Attend_Class_Page", "Attendence Class Page Executing");
	WebDriverWait wait = new WebDriverWait(driver, 30);
	test2.log(Status.PASS, "Click on Attend Class TAB");
	driver.findElementById("in.org.vidyalaya.android:id/tv_view_syllabus").click();
	test2.log(Status.PASS, "Wait Until Element Visible");
	MobileElement els3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.CheckedTextView[1]");
	wait.until(ExpectedConditions.visibilityOf(els3));
	els3.click();
	driver.findElementByXPath("//android.widget.Button[@text='DONE']").click();
	test2.log(Status.PASS, "Click on Email");
	MobileElement els6 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Email']");
	wait.until(ExpectedConditions.visibilityOf(els6));
	els6.click();
	test2.log(Status.PASS, "click on 1st item in list ");
	List<MobileElement> els7 = (List<MobileElement>) driver.findElementsByXPath("//android.widget.TextView[@text='Computers']");
	wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("(//android.widget.TextView[@text='Computers'])[1]")));
	els7.get(0).click();
	test2.log(Status.PASS, "wait Until Give Exam");
	starttime = System.currentTimeMillis();
	MobileElement els8 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@text='Give Exams']");
	wait.until(ExpectedConditions.visibilityOf(els8));
	endtime = System.currentTimeMillis();
	test2.log(Status.PASS, "Click on Back Thrice");
	driver.findElementById("in.org.vidyalaya.android:id/ib_back").click();
	wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("(//android.widget.TextView[@text='Computers'])[1]")));
	MobileElement els1 = (MobileElement) driver.findElementByAccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎");
	els1.click();
	Thread.sleep(3000l);
	MobileElement els2 = (MobileElement) driver.findElementByAccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎");
	els2.click();
	Thread.sleep(3000l);
	MobileElement els10 = (MobileElement) driver.findElementByAccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎");
	els10.click();
	test2.log(Status.PASS, "Element to be wait");
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/ivProfile")));
	MobileElement result= (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_view_syllabus");
	Assert.assertEquals(result.getText(), "Attend Class");
	reponsetime = (endtime-starttime)/1000.0;
}

@Test(dependsOnMethods = "Attend_Class_Page")
public void Take_Test_Page() throws InterruptedException {

	WebDriverWait wait = new WebDriverWait(driver, 30);
	MobileElement taketest = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView");
	taketest.click();
	wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("(//android.widget.TextView[@text='Released'])[1]")));
	MobileElement taketest1 = (MobileElement) driver.findElementByXPath("(//android.widget.TextView[@text='Released'])[1]");
	taketest1.click();
	starttime = System.currentTimeMillis();
	wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//android.widget.TextView[@text='Start Test']")));
	endtime = System.currentTimeMillis();
	MobileElement TakeResult= (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Exam details']");
	Assert.assertEquals(TakeResult.getText(), "Exam details");
	MobileElement take1 = (MobileElement) driver.findElementByAccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎");
	take1.click();
	Thread.sleep(3000l);
	MobileElement take2 = (MobileElement) driver.findElementByAccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎");
	take2.click();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/ivProfile")));
	MobileElement result= (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_view_syllabus");
	Assert.assertEquals(result.getText(), "Attend Class");
	reponsetime = (endtime-starttime)/1000.0;

}

@Test(dependsOnMethods = {"Take_Test_Page"})
public void Pay_Fees_Page() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	MobileElement pay1 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Pay Fees']");
	pay1.click();
	wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//android.widget.TextView[@text='Your Premium Subscription']")));
	MobileElement pay2= (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='No Ads']");
	Assert.assertEquals(pay2.getText(), "No Ads");
	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎']")).click();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/ivProfile")));
	MobileElement pay3= (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_view_syllabus");
	Assert.assertEquals(pay3.getText(), "Attend Class");
	reponsetime = (endtime-starttime)/1000.0;
	
}
@Test(dependsOnMethods = {"Pay_Fees_Page"})
public void Teachers_Dashboard_Page() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	MobileElement Techer1 = (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_teacher");
	Techer1.click();
	Thread.sleep(1000l);
	MobileElement Techer2 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	Techer2.click();
	Thread.sleep(1000l);
	MobileElement Techer3 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	Techer3.click();
	MobileElement Techer4 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
	Techer4.click();
	starttime = System.currentTimeMillis();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Class Teacher']")));
	endtime = System.currentTimeMillis();
	driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]").click();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_view_syllabus")));
	MobileElement Teacher= (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_view_syllabus");
	Assert.assertEquals(Teacher.getText(), "Attend Class");
	reponsetime = (endtime-starttime)/1000.0;

}
@Test(dependsOnMethods = {"Teachers_Dashboard_Page"})
public void Take_a_Break_Page() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	MobileElement Take1 = (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_take_a_break");
	Take1.click();
	starttime = System.currentTimeMillis();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Extra Curricular Activities']")));
	endtime = System.currentTimeMillis();
	driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]").click();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/ivProfile")));
	MobileElement Take2= (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_view_syllabus");
	Assert.assertEquals(Take2.getText(), "Attend Class");
	reponsetime = (endtime-starttime)/1000.0;
}
@Test(dependsOnMethods = "Take_a_Break_Page")
public void Resume_Class_Page() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	MobileElement resume1 = (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_attend_class");
	resume1.click();
	starttime = System.currentTimeMillis();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/progressHolder")));
	endtime = System.currentTimeMillis();
	driver.findElementById("in.org.vidyalaya.android:id/progressHolder").click();
	MobileElement els8 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@text='Give Exams']");
	wait.until(ExpectedConditions.visibilityOf(els8));
	driver.findElementById("in.org.vidyalaya.android:id/ib_back").click();
	driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]").click();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/ivProfile")));
	MobileElement resume2= (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_view_syllabus");
	Assert.assertEquals(resume2.getText(), "Attend Class");	
	reponsetime = (endtime-starttime)/1000.0;
}
@Test(dependsOnMethods = "Resume_Class_Page")
public void Report_Class_Page() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	MobileElement resume1 = (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_reportcard");
	resume1.click();
	starttime = System.currentTimeMillis();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Syllabus']")));
	endtime = System.currentTimeMillis();
	driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]").click();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/ivProfile")));
	MobileElement Take2= (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_view_syllabus");
	Assert.assertEquals(Take2.getText(), "Attend Class");
	reponsetime = (endtime-starttime)/1000.0;
}
@Test(dependsOnMethods = "Report_Class_Page")
public void Student_Attendance_Page() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	MobileElement attendence1 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Attendance']");
	attendence1.click();
	starttime = System.currentTimeMillis();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Absent']")));
	endtime = System.currentTimeMillis();
	driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]").click();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/ivProfile")));
	MobileElement attendence2= (MobileElement) driver.findElementById("in.org.vidyalaya.android:id/tv_view_syllabus");
	Assert.assertEquals(attendence2.getText(), "Attend Class");
	reponsetime = (endtime-starttime)/1000.0;

}
@Test(dependsOnMethods = {"Student_Attendance_Page"})
public void Logout_Page() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	MobileElement signout1 = (MobileElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
	signout1.click();
	starttime = System.currentTimeMillis();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementByXPath("//android.widget.CheckedTextView[@text='Settings']")));
	endtime = System.currentTimeMillis();
	MobileElement signout2 = (MobileElement) driver.findElementByXPath("//android.widget.CheckedTextView[@text='Settings']");
	signout2.click();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementById("in.org.vidyalaya.android:id/btnSignOut")));
	driver.findElementById("in.org.vidyalaya.android:id/btnSignOut").click();
	wait.until(ExpectedConditions.visibilityOf((MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Sign In']")));
	reponsetime = (endtime-starttime)/1000.0;
}
}