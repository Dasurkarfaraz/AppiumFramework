package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class BaseClass extends ExtentReportsDemo{
	
	AppiumDriver<MobileElement> driver; 
	public static MobileElement mobileElement;
	public static long starttime;
	public static long endtime;
	public static double reponsetime = 0.0;
	public static String ApplicationName  = "Ass Vidyalaya login logout and other functionalities";
	 int count;
	 int newValue;
	@BeforeSuite
	public void setup() {
		
		try {
			
		DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "Faraz Dasurkar");
			caps.setCapability ("platformName", "Android");
			caps.setCapability("platformVersion", "12");
			caps.setCapability("appPackage", "in.org.vidyalaya.android") ;
			caps.setCapability("appActivity", "in.org.vidyalaya.android.activities.SplashActivity");
	
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(service.getUrl(), caps);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver = new AndroidDriver<MobileElement>(url, caps);
		//driver = new IOSDriver<MobileElement>(url, caps);
		
		
		}catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
			exp.printStackTrace();
			
		}
		
	}
	@AfterMethod
	public void reponse(ITestResult result) throws IOException {
		long a = result.getEndMillis()-result.getStartMillis();
		System.out.println("Time taken to run test is :"+(a)/1000.0+" Sec");
		String responseT = Double.toString(reponsetime);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyy");
		LocalDateTime now = LocalDateTime.now();
		String CurrentDate = dtf.format(now);
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now1 = LocalDateTime.now();
		String time = dtf1.format(now1);
		String MethodName = result.getName();
		
		File src=new File("C:\\Users\\faraz\\OneDrive\\Documents\\Appium\\AppiumDemoProject\\ReportWithReponse\\Data.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0); 
		int RowCount = sheet.getLastRowNum();
		int rowsum = RowCount+1;
		Row r =sheet.createRow(rowsum);
		sheet.getRow(rowsum).createCell(0).setCellValue(ApplicationName);
		sheet.getRow(rowsum).createCell(1).setCellValue(MethodName);
		sheet.getRow(rowsum).createCell(2).setCellValue(CurrentDate);
		sheet.getRow(rowsum).createCell(3).setCellValue(time);
		if(ITestResult.SUCCESS==result.getStatus()) {
			sheet.getRow(rowsum).createCell(4).setCellValue(responseT);
		}
		
//		sheet.getRow(rowsum).createCell(4).setCellValue((a)/1000.0+" Sec");
		if(ITestResult.FAILURE== result.getStatus() ) {
			
			sheet.getRow(rowsum).createCell(5).setCellValue("E");		
			
		}
		FileOutputStream  FW = new FileOutputStream(src);
		workbook.write(FW);
		fis.close();
	
	}
	
	@AfterSuite
	public void teardown() {
		
		driver.quit();
		
	}
}
