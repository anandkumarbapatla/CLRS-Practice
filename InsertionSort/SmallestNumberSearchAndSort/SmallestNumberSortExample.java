
public class SmallestNumberSortExample {

	public static void main(String[] args) {
		int[] exampleArray = {31, 41, 59, 26, 41, 58};
		System.out.println("************Before Sorting***********");
		for (int element: exampleArray) {
            System.out.println(element);
        }
		SmallestNumberSort SNS = new SmallestNumberSort();
		exampleArray = SNS.smallestNumberSort(exampleArray);
		System.out.println("************After Sorting***********");
		for (int element: exampleArray) {
            System.out.println(element);
        }

	}

}
