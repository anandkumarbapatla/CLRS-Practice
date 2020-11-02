
public class SmallestNumberSort {
	
	/*
	 * Find the smallest integer and swap it with the LSB of the array
	 */
	public int[] smallestNumberSort(int[] exampleArray) {
		for(int i=0; i<exampleArray.length;i++) {
			int smallestNumberIndex = i;
			for(int j=i+1; j< exampleArray.length;j++) {
				if(exampleArray[j] < exampleArray[smallestNumberIndex]) {
					smallestNumberIndex = j;
				}
			}
			int intermidietaryNum = exampleArray[smallestNumberIndex];
			exampleArray[smallestNumberIndex] = exampleArray[i];
			exampleArray[i] = intermidietaryNum;
		}
		return exampleArray;
		
	}

}
