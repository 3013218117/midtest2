import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortingTest {
	private Sorting s = null;
	private int [] arr = {1,2,3};
	private int [] arr1 = { 2,3,1};
	private int [] arr3 = {5,1,2,4,1,2,5,7,1,2,3,4,5,7,8,9,10};
	private int [] arr4 = {1,1,2,4,1,2,5,7,1,2,3,4,5,7,8,9,10};
	private int [] arr5 = {11,1,2,4,1,2,5,7,1,2,3,4,5,7,8,9,10};
	private int [] arr6 = {10, 2, 1, 1, 1, 15, -1, 0, 22, -30, 99, 1, 1, 1, -4};
	private int [] arr7 = {-10, 2, 1, 1, 1, 15, -1, 0, 22, -30, 99, 1, 1, 1, 4};
	private Object [] arr2 = {1,2,3};
	
	@Before
	public void setUp() throws Exception {
		s = new Sorting ();
		
	}

	@Test
	public void testInsertionSort() {
		s.insertionSort(arr);
		s.insertionSort(arr1);
	}

	@Test
	public void testIsSorted() {
		
		assertEquals(true,s.isSorted(arr));
		assertEquals(true,s.isSorted(arr1));
	}
	@SuppressWarnings("static-access")
	@Test
	public void testQuicksort() {
		s.quicksort(arr);
		s.quicksort(arr3);
		s.quicksort(arr4);
		s.quicksort(arr5);
		s.quicksort(arr6);
		
	}
	@SuppressWarnings("static-access")
	@Test
	public void testQuicksort2() {
		
		s.quicksort(arr7);
	}
	@SuppressWarnings("static-access")
	@Test
	public void testQuicksort3() {
		
		s.quicksort(arr6);
	}
	@SuppressWarnings("static-access")
	@Test
	public void testSwapReferences() {
		s.swapReferences(arr2, 1, 2);
	}

	@SuppressWarnings("static-access")
	@Test
	public void testSwap() {
		s.swap(arr, 1, 2);
	}
	

}
