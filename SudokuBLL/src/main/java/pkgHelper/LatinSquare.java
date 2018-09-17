package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] myLatinSquare;
/*myLatinSquare is an instance variable with a 2d array*/
	
	public LatinSquare() {	
	}
	
	public LatinSquare(int[][] mylatinSquare) {
		super();
		this.myLatinSquare = mylatinSquare;
	}
	
	public int[][] getLatinSquare() {
		return myLatinSquare;
	}
	
	public void setLatinSquare(int[][] myLatinSquare) {
		this.myLatinSquare = myLatinSquare;
	}
	
	public boolean containsZero(){
		boolean containsZero = false;
		
		for (int iCol = 0; iCol < myLatinSquare.length; iCol++){
			for (int iRow = 0; iRow < myLatinSquare.length; iRow++){
				if (myLatinSquare[iCol][iRow] == 0){
					return true;
				}
			}
		}
		return containsZero;
	}
	
	/*Checks to see if any of the elements in the Latin square contain 0; if so, returns true*/
	/*uses a for-loop to check every element in the column, followed by a nested for-loop that checks the rows*/
	/*if iCol or iRow in LatinSquare == 0, return true*/
	/*else return false*/
	
	// Takes in a row, and checks if the iValue is within the row
	public boolean doesElementExist(int[] arr, int iValue){
		boolean doesElementExist = false;
		
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == iValue){
				return true;
			}
		}
		return doesElementExist;
	}
	
	public int[] getColumn(int iCol){
		int[] intColumn = new int[myLatinSquare.length];
		for (int iColumn = 0; iColumn < myLatinSquare.length; iColumn++){
			intColumn[iColumn] = myLatinSquare[iColumn][iCol];
		}
		return intColumn;
	}
	
	public int[] getRow(int iRow){
		return myLatinSquare[iRow];
	}
	
	public boolean hasDuplicates(int [] arr){
		boolean hasDuplicates = false;
		
		if (arr == null)
			return hasDuplicates;
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1]){
				hasDuplicates = true;
				break;
			}
		}
		return hasDuplicates;
	}
	
	public boolean hasAllValues (int [] arrx, int [] arry) {
		boolean hasAllValues = false;
		
		for (int x = 0; x < arrx.length; x++) {
			for(int y = 0; y < arry.length; y++) {
				if (arrx[x] == arry[y]) {
					hasAllValues = true;
					break;
				}
			}
		}
		return hasAllValues;
	}
	
	/* Each row in latinsquare does not contain duplicates
	 * each column in latinsquare does not contain duplicates
	 * each value in the first row of latinsquare is found in every other row of the latinsquare
	 * each value in the first row of latinsquare is found in every other column of the latinsquare
	 */
	public boolean isLatinSquare () {
		boolean isLatinSquare = false;
		
		for(int y = 0; y < myLatinSquare[0].length; y++) {
			hasDuplicates(myLatinSquare[y]);
		}
		
		for(int x = 0; x < myLatinSquare.length; x++) {
			hasDuplicates(myLatinSquare[x]);
		}
		
		for(int y = 0; y < myLatinSquare[0].length - 1; y++) {
			hasAllValues(myLatinSquare[y], myLatinSquare[y + 1]);
		}
		
		for(int x = 0; x < myLatinSquare.length - 1; x++) {
			hasAllValues(myLatinSquare[x], myLatinSquare[x + 1]);
		}
		
		return isLatinSquare;
	}
}
