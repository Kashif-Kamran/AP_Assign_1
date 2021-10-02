import static org.junit.Assert.*;
import java.util.Random;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

public class LinkedListTest {

	LinkedList NULLlist;
	LinkedList list;
	
	@Test
	public void test1_Null()
	{	
		assertNull(NULLlist);
	}
	@Test
	public void test2_PushFront()
	{

		list=new LinkedList();
		list.pushFront(6);
		assertEquals(LinkedList.headPointer.data,6);
		list.pushFront(3);
		assertEquals(LinkedList.headPointer.data,3);
		list.pushFront(8);
		assertEquals(LinkedList.headPointer.data,8);
		list.display();
		
	}
	@Test
	public void test3_Add()
	{

		list=new LinkedList();
		Random rand=new Random();
		int size=5;
		int [] array=new int [size];
		int topLim=100;
		// Initilization of array and LinkedList with random Data
		for(int i=0; i<size;i++)
		{
			array[i]=rand.nextInt(topLim);
			list.add(array[i]);
		} 
		LinkedList itr=LinkedList.headPointer;
		for(int i=0; i<size; i++)
		{
			assertEquals(itr.data,array[i]);
	 		itr=itr.nextPointer;
		}
	}
	@Test
	public void test4_TopFront() throws Exception
	{
		list=new LinkedList();
		list.add(4);
		list.display();
		assertEquals(list.topBack(),4);
		list.add(5);
		list.display();
		assertEquals(list.topBack(),5);
	}
	@Test
	public void test5_PushBack()
	{
		list=new LinkedList();
		list.pushBack(101);
		assertEquals(LinkedList.tailPointer.data,101);
		list.pushBack(104);
		assertEquals(LinkedList.tailPointer.data,104);
		list.pushBack(107);
		assertEquals(LinkedList.tailPointer.data,107);
	}
	@Test
	public void test6_popFront() throws Exception
	{
		list=new LinkedList();
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.display();
		assertEquals(list.topBack(),3);
		list.popFront();
		assertEquals(list.topBack(),2);
		list.popFront();
		assertEquals(list.topBack(),1);
	}
}
