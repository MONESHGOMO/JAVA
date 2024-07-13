package GOMO_JAVA_CODES;

public class Geeks_For_Geeks {

	public static void main(String[] args) {
   
	/*	https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=1&difficulty=Basic&sortBy=submissions
		
		Given an array, arr of n integers, and an integer element x, find whether element x is present in the array. Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.

		Examples:

		Input: arr[] = [1, 2, 3, 4], x = 3
		Output: 2
		Explanation: There is one test case with array as [1, 2, 3 4] and element to be searched as 3. Since 3 is present at index 2, the output is 2.
     */
		int arr[]= {1,2,3,4};
		int x=3;
		System.out.println(search(arr,x));
		
	 
	}
	
	static int search(int arr[],int x) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==x) {
				return i;
			}
			
		}
		return -1;
	
	}

}
