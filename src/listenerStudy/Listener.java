package listenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
@Override	
public void	onTestFailure(ITestResult result)
	{
		Reporter.log("Take screenshot",true);
	}

@Override	
public void	onTestSuccess(ITestResult result)
	{
		Reporter.log("Tst passed successfuly",true);
	}


@Override	
public void	onTestSkipped(ITestResult result)
	{
		Reporter.log("This test is skipped",true);
	}

}
