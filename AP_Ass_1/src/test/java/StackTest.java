import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StackTest {
	@Test
	public void test1_push() throws Exception
	{
		MyStack stack=new MyStack(15);
		for(int i=0; i<15; i++)
		{
			stack.push(i);
		}
		stack.displayStack();
		for(int i=14; i>=0; i--)
		{
			assertEquals(stack.pop(),i);
		}
	}
	@Test 
	public void test2_pop() throws Exception
	{
		MyStack stack=new MyStack(10);
		for(int i=0; i<10; i++)
		{
			stack.push(i);
		}
		for(int i=9;i>=0;i--)
		{
			assertEquals(stack.pop(),i);
		}	
	}
	@Test 
	public void test3_top() throws Exception
	{
		MyStack stack=new MyStack(10);
		for(int i=0; i<10; i++)
		{
			stack.push(i);
		}
		for(int i=9;i>=0;i--)
		{
			assertEquals(stack.top(),i);
			stack.pop();
		}	
	}
}
