package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListenerDemo implements IRetryAnalyzer{
	
	private int retryCount = 0;
	private int maxRetryCount = 2;

	public boolean retry(ITestResult result) {
		if(retryCount < maxRetryCount ) {
			System.out.println("Retrying......");
			retryCount++;
			return true;
		}
		return false;
	}

}
