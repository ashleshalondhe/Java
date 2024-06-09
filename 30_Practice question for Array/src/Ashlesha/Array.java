package Ashlesha;

public class Array {

	public static void main(String[] args) {
// Problem1: Create an array of 5 floats and calculate their sum
		
		/*
		 float [] marks = {45.7f, 67.4f, 45.6f, 99.5f, 100.0f};
		
		float sum = 0;
		
		for(float element:marks) {
			
			sum = sum + element;
		}
		
		System.out.println("The value of sum is "+sum); 
		
		*/
		
      /* Problem 2: Write a program to find out whether 
		a given integer is present in an array or not 
		
        float [] marks = {45.7f, 67.4f, 45.6f, 99.5f, 100.0f};
		
		float num = 45.7f;
		boolean isInArray = false;
		for(float element:marks) {
			
			if(num==element) {
				
				isInArray = true;
				break;
				
			}
		}
		if(isInArray) {
			 System.out.println("The value is present in the array ");
			 
		}
		
		else {
			System.out.println("The value is not present in the array ");
		}
		*/
		
		/* Problem 3: Calculate the average marks from an array containing 
		 marks of all students in physics using for- each loop
		  
		
        float [] marks = {45.7f, 67.4f, 45.6f, 99.5f, 100.0f};
		
		float sum = 0;
		
		for(float element:marks) {
			
			sum = sum + element;
		}
		
		System.out.println("The value of average marks is "+sum/marks.length); 
		*/
		
		
		/* Problem 4: Create a java program to add two matrices of size 2x3
		
		
		int [] [] mat1 = {{1,2,3}, 
				          {4,5,6}};
		int [] [] mat2 = {{2,6,13}, 
		                  {3,7,1}};
		int [] [] result = {{0,0,0}, 
		                    {0,0,0}};
		
		for (int i=0; i<mat1.length; i++) {			
			for (int j=0; j<mat1[i].length; j++) {
				System.out.format("Setting value for i=%d and j=%d \n", i, j);
				
				result [i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		
		for (int i=0; i<mat1.length; i++) {			
			for (int j=0; j<mat1[i].length; j++) {
				System.out.print(result[i][j]+" ");
				
				result [i][j] = mat1[i][j] + mat2[i][j];
			}
			System.out.println("");
		}
		*/
		
		/* Problem 5: Write a java program to reverse an array
		 
		int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }
		*/
		
		/* Problem 6: Write a Java program to find the maximum element in an array
		 int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 6
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        */
        // Problem 7: Write a Java program to find whether an array is sorted or not.
        
		boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
		
		
		
		
		
		
	}

}
