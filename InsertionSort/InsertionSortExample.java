
public class InsertionSortExample {
	
	public static void main(String[] args) {
		InsertionSort IS = new InsertionSort();
		int[] exampleArray = {31, 41, 59, 26, 41, 58};
		System.out.println("************Before Sorting***********");
		for (int element: exampleArray) {
            System.out.println(element);
        }
		exampleArray = IS.sortArray(exampleArray);
		System.out.println("************After Sorting***********");
		for (int element: exampleArray) {
            System.out.println(element);
        }
	}

}
