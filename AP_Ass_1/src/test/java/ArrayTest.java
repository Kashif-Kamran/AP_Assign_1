import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;
//Array Programs - ArrayInsertion, ArrayDeletion, DisplayArray, LinearSearch, BinarySearch, BubbleSort
public class ArrayTest {
	
	private Array testArray=new Array();
	@Test
	public void insertionTestPositive() 
	{	// Insertion of 100 values and testing
		// Positive Testing
		int limit=90;
		int [] expected=new int [limit];
		// filling expected Array
		for (int i=0; i<limit; i++)
		{
			expected[i]=i*8;
		}
		for (int i=0; i<limit; i++)
		{
			testArray.insert(i*8,i);
		}
		for (int i =0; i<limit; i++)
		{
			assertEquals(expected[i],testArray.array[i]);
		}
	}
	@Test
	public void insertionTestNegitive()
	{
		// Negitive Testing
		// Total Size of Array is 100 that is 100, above insertion is not compitible here
		int limit=109;
		int [] expected=new int [limit];
		// filling expected Array
		for (int i=0; i<limit; i++)
		{
			expected[i]=i*8;
		}
		for (int i=0; i<limit; i++)
		{
			testArray.insert(i*8,i);
		}
		for (int i =0; i<limit; i++)
		{
			assertEquals(expected[i],testArray.array[i]);
		}
	}
	@Test
	public void linearSearchTest()
	{
		//Initillizing the array
		for (int i=0; i<20; i++)
		{
			testArray.insert(i*8,i);
		}
		boolean searchValue=testArray.linearSearch(48);
		assertTrue(searchValue);
		searchValue=testArray.linearSearch(88);
		assertTrue(searchValue);
		searchValue=testArray.linearSearch(136);
		assertTrue(searchValue);
	}
	@Test
	public void bubbleSortTest()
	{
//		Init. of Array
		Random rand=new Random();
		int upperBound=700;
		for(int i=0; i<100; i++)
		{
			testArray.insert(rand.nextInt(upperBound),i);
		}
		testArray.bubbleSort();
		
		boolean check=true;
		for (int i=0; i<99;i++)	
		{
			if(testArray.array[i]>testArray.array[i+1])
			{
				check=false;
			}
		}
		assertTrue(check);
	}
	@Test
	public void binarySearchTest()
	{
		//Initillizing the array
		for (int i=0; i<50; i++)
		{
			testArray.insert(i*8,i);
		}
		assertTrue(testArray.binarySearch(96, 0, 50));
	}
	@Test
	public void deleteTest()
	{
		for (int i=0; i<50; i++)
		{
			testArray.insert(i*4,i);
		}
		testArray.delete(24);
		assertEquals(testArray.array[24],100);
	}
}
	

