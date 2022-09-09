package Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayPractice();
		int[][] arr1 = { { 1, 2 }, { 3, 4 } };
		int[][] arr2 = { { 5, 6, 7 }, { 8, 9, 10 } };
		int[][] array = multiplication(2, 2, arr1, 2, 3, arr2);
	System.out.println("Array Multi plication");
		array2dPrint(array);
		int[] rotate = {1,2,3,4,5,6,7};
		System.out.println("Array left Rotate");
		System.out.println(Arrays.toString(arrayLeftRotate(rotate, 5)));
		System.out.println("Array Right Rotate");
		System.out.println(Arrays.toString(arrayRightRotate(rotate, 3)));
		
		stringPattern("program");
		
		String[][] str = {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
		System.out.println("count of Grandson  "+grandSonFind(str, "ronaldo"));
		
		int[] arrayWeight = {49,36,8,10,12};
		weightSortIn2dArray(arrayWeight);

	}

	private static void arrayPractice() {
		System.out.println(Arrays.class.getClass());
		int[] arr = { 1, 2,3,4,5,6,7 };

		Arrays.sort(arr);
		int[] temp = arr.clone();
		int mid = arr.length / 2;
		System.out.println(arr[mid]);
		int i = 0;
		int j = 0;
		if (arr.length % 2 == 0) {
			i = mid - 1;
			j = mid;
		} else {
			i = mid;
			j = mid+1;
		}
		boolean status = true;

		for (int k = 0; k < arr.length; k++) {
			if (status) {
				arr[k] = temp[i--];
			} else {
				arr[k] = temp[j++];
			}
			status = !status;
		}

		System.out.println(Arrays.toString(arr));
	}

	private static int[][] multiplication(int row1, int col1, int[][] arr1, int row2, int col2, int[][] arr2) {
		int[][] array = new int[row1][col2];
		if (col1 != row2) {
			System.out.println("Matrix Multiplication Not Possible");
		} else {

			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col2; j++) {
					for (int k = 0; k < row2; k++) {
						array[i][j] += arr1[i][k] * arr2[k][j];

					}
				}

			}

		}
		return array;
	}

	private static void array2dPrint(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	private static void weightArray(int[][] arr) {
		
	}
	
	private static int[] arrayLeftRotate(int[] arr,int element) {
		int index = findIndex(arr, element);
		
		for(int i=0;i<index;i++) {
			int first = arr[0];
			for(int j =1;j<arr.length;j++) {
				arr[j-1]= arr[j];
				
			}
			arr[arr.length-1] = first;
		}
		
		return arr;
	}
	
	private static int[] arrayRightRotate(int[] arr,int element) {
		int index = findIndex(arr, element);
		
		for(int i=0;i<index;i++) {
			int last = arr[arr.length-1];
			for(int j =arr.length-1;j>0;j--) {
				arr[j]= arr[j-1];
				
			}
			arr[0] = last;
		}
		
		return arr;
	}
	private static int findIndex(int[] arr,int element) {
		int ans = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]== element) {
				ans = i;
				return ans;
			}
		}
		return ans; 
	}

	private static void stringPattern(String str) {
		int len = str.length();

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i == j || i + j == len - 1) {
					System.out.print(str.charAt(i));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	private static int  grandSonFind(String[][] str,String name) {
		String son = " ";
		int j = 0;
		int count = 0;
		
		for (int i = 0; i < str.length; i++) {
			if (str[i][1].equals(name)) {
				son = str[i][0];
				break;
			}
		}
		for (int k = 0; k < str.length; k++) {
			if (str[k][1] == son) {
				count++;
			}
		}
		return count;
	}
	
	private static void  weightSortIn2dArray(int[] arr) {
		int[][] ans = new int[arr.length][2];
		
		int count;
		for(int i=0;i<arr.length;i++) {
			count = 0;
			if(Math.sqrt(arr[i])%1 == 0) {
				count += 5;
			} if(arr[i]%4 == 0&&arr[i]%6 == 0) {
				count += 4;
			}if(arr[i]%2 == 0) {
				count += 3;
			}
			ans[i][0] = arr[i];
			ans[i][1] = count;
			
		}
		
		
		System.out.println(Arrays.deepToString(ans));
		
		for(int i = 0;i<ans.length;i++) {
			for(int j = i+1 ;j<ans.length;j++) {
				if(ans[i][1]<ans[j][1]) {
					ans[i][1] = ans[i][1] + ans[j][1] - (ans[j][1] = ans[i][1]);
					ans[i][0] = ans[i][0] + ans[j][0] - (ans[j][0] = ans[i][0]);
//					int temp = ans[i][1];
//					ans[i][1] = ans[j][1];
//					ans[j][1] = temp;
				}
				
			}
		}
		System.out.println(Arrays.deepToString(ans));
	}
//[[49, 12], [36, 7], [8, 5], [10, 3], [12, 3]]	
}


