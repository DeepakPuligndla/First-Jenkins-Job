import junit.runner.JUnitCore;
import junit.runner.Result;
import junit.runner.notification.Failure;

public class addition
{
	public static void main(String args[])
	{
		Result result = JUnitCore.runClasses(Addition.class);
		for (Failure failure : result.getFailure())
		{
			System.out.println(result.toString());
		}

		if (result.wasSuccessful())
		{
			System.out.println("Test case passed!");
		}
	}	
}
