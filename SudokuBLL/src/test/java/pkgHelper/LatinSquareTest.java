package pkgHelper;

import static org.junit.Assert.*;
import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		
		int [] arr = {1,2,3,4,5,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
	}
	
	@Test
	public void doesElementExist_test1() {

		int[][] mySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
		LatinSquare myLatinSquare = new LatinSquare(mySquare);
		int[] myArr = { 1, 2, 3 };
		
		assertTrue(myLatinSquare.doesElementExist(myArr,2));
	}
	
	@Test
	public void hasAllValues_test1() {
		
		int[][] mySquare = { {1, 2}, {2, 1}};
		LatinSquare myLatinSquare = new LatinSquare(mySquare);
		int[] myArr1 = { 1, 2 };
		int[] myArr2 = { 2, 1 };
		
		assertTrue(myLatinSquare.hasAllValues(myArr1, myArr2));
	}
	
	@Test
	public void getColumn_test1() {
		int[][] mySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
		LatinSquare myLatinSquare = new LatinSquare(mySquare);
		int[] myArr = {1,3,2};
		
		assertArrayEquals(myArr, myLatinSquare.getColumn(0));
		
	}
	
	@Test
	public void getColumn_test2() {
		int[][] mySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 }, { 2, 3, 1 }, { 2, 3, 1 } };
		LatinSquare myLatinSquare = new LatinSquare(mySquare);
		int[] myArr = {1,3,2, 2, 2};
		
		assertArrayEquals(myArr, myLatinSquare.getColumn(0));
		
	}
	
	@Test
	public void getRow_test1() {
		int[][] mySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
		LatinSquare myLatinSquare = new LatinSquare(mySquare);
		int[] myArr = {1,2,3};
		
		assertArrayEquals(myArr, myLatinSquare.getRow(0));
	}
	
	@Test
	public void containsZero_test1() {
		int[][] mySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 0, 1 } };
		LatinSquare myLatinSquare = new LatinSquare(mySquare);
		
		assertTrue(myLatinSquare.containsZero());
	}
	
	@Test
	public void isLatinSquare_test1() {
		
		int[][] mySquare = { { 1, 2, 3 }, { 1, 1, 2 }, { 2, 3, 1 } };
		LatinSquare myLatinSquare = new LatinSquare(mySquare);
		
		assertFalse(myLatinSquare.isLatinSquare());
		
	}
}



