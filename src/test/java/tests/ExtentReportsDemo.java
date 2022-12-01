package tests;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo extends AppiumserverAutoStart{

	ExtentSparkReporter spark;
	protected ExtentReports extent;
	String today;

	@BeforeSuite
	public void reportSetup() {
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		LocalDateTime now2 = LocalDateTime.now();
		today = dtf2.format(now2);
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("logsReport/AssVidyalayaloginlogoutandotherfunctionalities"+ today +".html");
		extent.attachReporter(spark);
		startAppiumServer();
	}

	@AfterSuite
	public void reportTeardown() {
	  extent.flush();
	  service.stop();
	
	 }
}
