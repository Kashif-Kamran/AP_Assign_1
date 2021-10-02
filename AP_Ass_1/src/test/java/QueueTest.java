import static org.junit.Assert.*;

import org.junit.Test;

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
}
