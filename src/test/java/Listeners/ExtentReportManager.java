package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;//	// ExtentSparkReporter is used to generate the report in HTML format
	public ExtentReports extentReports;//	// ExtentReports is used to create the report object
	public ExtentTest test;//	// ExtentTest is used to create the test object
	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/ExtentReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Automation Testing  Report");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", "Windows");
		extentReports.setSystemInfo("Browser", "Chrome");
		
			
	}
	
	public void onTestSuccess(ITestResult result) {
		
	test = extentReports.createTest(result.getName());
	test.log(Status.PASS, "Test Case Passed is: " + result.getName());
	}
     
	public void onTestFailure(ITestResult result) {
		
		test = extentReports.createTest(result.getName());
		test.log(Status.FAIL, "Test Case Failed is: " + result.getName());
		test.log(Status.FAIL, "Test Case Failed is: " + result.getThrowable());
	}
	public void onTestSkipped(ITestResult result) {
		
		test = extentReports.createTest(result.getName());
		test.log(Status.SKIP, "Test Case Skipped is: " + result.getName());
	}
	 @Override
	    public void onFinish(ITestContext context) {
	        extentReports.flush(); // <---- this flushes the report to the file
	    }
}
