public class GrabinskiJamesGE17 {

	public static void main(String[] args) {
		//explore assigning one array to another
		System.out.printf("Part 1: Assign array1 to array2\n");
		int[] array1 = new int[4];
		//int[] array2 = new int[4];	
		
		array1[0] = 10;
		array1[1] = 2;
		array1[2] = 45;
		array1[3] = 12;
		displayArray(array1);
//		array2[0] = 1;
//		array2[1] = 112;
//		array2[2] = 82;
//		
//		System.out.printf("\nOriginal Arrays");
//		System.out.printf("\nDisplay array1\n");	
//		System.out.printf("\nDisplay array2\n");
//		displayArray(array2);
//		
//		array2 = array1;
//		System.out.printf("\nAfter array2 = array1\n");
//		System.out.printf("Display array1\n");	
//		displayArray(array1);
//		System.out.printf("Display array2\n");
//		displayArray(array2);
//		
//		array1[1] = 9000;
//		array2[3] = 1000;
//		System.out.printf("\nAfter array1[1] = 9000");
//		System.out.printf("\nAfter array2[3] = 1000");
//		System.out.printf("\nDisplay array1");	
//		displayArray(array1);
//		System.out.printf("\nDisplay array2");
//		displayArray(array2);
//		
//		
//		int[] arrayCopy = new int[4];	
//		System.out.printf("Part 2 Copy each element into a new Array");
//		// Correct way to copy arrays
//				for (int i = 0; i < array1.length; i++) {
//					arrayCopy[i] = array1[i];
//		}
//		array1[1] = -400;
//		arrayCopy[3] = -999;
//		System.out.printf("\nDisplay array1");	
//		displayArray(array1);
//		System.out.printf("\nDisplay arrayCopy");
//		displayArray(arrayCopy);
//				
//
//		
//		int[] array3 = new int[4];	
//		
//		array3[0] = 100;
//		array3[1] = 200;
//		array3[2] = 300;
//		array3[3] = 400;
//		
//		//passing arrays to methods
//		System.out.printf("\nIn main display array3\n");
//		displayArray(array3);
//		updatePassedArray(array3);
//		System.out.printf("\nBack in main display array3\n");
//		displayArray(array3);
//		

	}// end main
	
	
	public static void updatePassedArray(int passedArray[])
	{		
		System.out.printf("\nIn passArray method");
		System.out.printf("\nDisplay passed array\n");
		displayArray(passedArray);
		System.out.printf("\nUpdate passedArray[3] = 9999");
		passedArray[3] = 9999;
		System.out.printf("\nDisplay passed array\n");
		displayArray(passedArray);			
	}
	
	public static void displayArray(int[] passedArray)
	{
		for (int i = 0; i < passedArray.length; i++) {
			
			System.out.printf("array1[%d] = %d \n",i, passedArray[i]);
		}
	}	
	
	
}//end class