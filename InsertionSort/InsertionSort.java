public class InsertionSort {
	
	/*
	 * sortArray method sorts the given array using insertion sort
	 * Input is an Integer array
	 * Returns a sorted Integer array
	 * Analogy is card game- cards picking from table and sorting in hand
	 */
	public int[] sortArray(int[] exampleArray){
		//Make sure the array is addressed from 0 to arraylength - 1
		for(int j = 1; j <= exampleArray.length-1;j++) {
			//current number picked from table
			int currentNumber = exampleArray[j];
			int i = j-1;
			//Change > to < so that it can give descending order
			while(i>=0 && exampleArray[i] > currentNumber) {
				//Copying doesn't loose the next term as we have it in current Number
				exampleArray[i+1] = exampleArray[i];
				i = i-1;
			}
			exampleArray[i+1] = currentNumber;
		}
		return exampleArray;
	}
}
