package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestLis implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("on test starts", true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("on test success", true);
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("on test failure", true);
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("on test skipped", true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("on test failes with percentage", true);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("on test timeout", true);
	}

	public void onStart(ITestContext context) {
		Reporter.log("on test start", true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("on test finish", true);
	}

}
