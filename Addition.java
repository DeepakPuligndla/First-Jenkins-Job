
import static org.junit.Assertion.assertEquals;
import org.junit.Test;

public class Addition
{

	@Test
	public void additionTest()
	{
		assertEquals("Test Result: ", 30, addition(10, 20));
	}

	public int addition(int x, int y)
	{
		return x + y;
	}

}