
public class BinaryIntegerAdditionExample {

	public static void main(String[] args) {
		
		BinaryIntegerAddition BIA = new BinaryIntegerAddition();
		int[] array1 = {1,0,1,1};
		int[] array2 = {1,1,1,0};
		
		int[] result = BIA.addBinaryIntegerArrays(array1, array2);
		for(int i:result) {
			System.out.println(result[i]);
		}

	}

}
