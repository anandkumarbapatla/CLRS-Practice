public class BinaryIntegerAddition {
	
	/*
	 * Given Binary integers stored in two n-integer arrays
	 * So lengths of array1 and array2 should be same
	 * Resultant array will have a carry bit appended
	 */
	public int[] addBinaryIntegerArrays(int[] array1,int[] array2) {
		//Initializing the resultant array of length array1+1
		int[] sum = new int[array1.length+1];
		//Checking if lengths are same or not
		if(array1.length == array2.length) {
			//iterating through each element in array and performing addition
			int carry = 0;
			for(int i = array1.length-1; i>=0;i--) {
				sum[i+1] = (array1[i]+array2[i]+carry)%2;
				if(array1[i]+array2[i]+carry >= 2) {
					carry = 1;
				}
				else {
					carry = 0;
				}
			}
			sum[0] = carry;
		}
		
		return sum;
	}

}
