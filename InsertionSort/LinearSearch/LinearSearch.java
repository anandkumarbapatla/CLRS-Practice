
public class LinearSearch {

	public int returnIndex(int[] exampleArray, int number) {
		int i = -1;
		for(int j = 0;j<exampleArray.length;j++) {
			if(exampleArray[j] == number) {
				i = j;
				return i;
			}
		}
		return i;
	}
}
