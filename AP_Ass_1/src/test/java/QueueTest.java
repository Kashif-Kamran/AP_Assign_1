import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QueueTest {

	@Test
	public void test1_Enqueue_Dequeue() throws Exception 
	{
		int [] array=new int [15];
		Queue qu=new Queue(15);
		for(int i=0; i<15; i++)
		{
			qu.enqueue(i);
			array[i]=i;
		}
		for(int i=0; i<15; i++)
		{
			
			assertEquals(qu.dequeue(),i);
		}
	}
	@Test
	public void test2_checkEmpty()
	{
		Queue qu=new Queue(100);
		assertTrue(qu.empty());
	}
	@Test
	public void test3_TestSizeVariation() throws Exception
	{
		Queue qu=new Queue(15);
		for(int i=0; i<15; i++)
		{
			qu.enqueue(i);
			assertEquals(qu.size(),i+1);
		}	
	}
	@Test
	public void test4_DisplayOnConsole() throws Exception
	{
		Queue queue=new Queue(15);
		for(int i=0; i<12;i++)
		{
			queue.enqueue(i);
		}
		queue.display();
		assertTrue(true);
	}
}
