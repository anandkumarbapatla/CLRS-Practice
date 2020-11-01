
public class LinearSearchExample {
	public static void main(String[] args) {
		LinearSearch LS = new LinearSearch();
		int[] exampleArray = {31, 41, 59, 26, 41, 58};
		int findInteger = 2;
		int index = LS.returnIndex(exampleArray, findInteger);
		System.out.println(index);
	}
}
