package guru;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.base;

public class listners extends base implements ITestListener {
	base b = new base();

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		// hey i am done
		System.out.println("On Finish");
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		// screenshot
		System.out.println("onTestFailure");
		try {
			b.takeScreenShot(result.getName());
			//b.takeScreenShot(result.getAttribute("uname"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped");
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart");
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess");
	}
}
