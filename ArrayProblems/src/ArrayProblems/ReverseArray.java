package ArrayProblems;

public class ReverseArray {
	
	public void reverseArray(int[] arrs){
		int size = arrs.length;
		int revArray[] = new int[size];
		int i,j;
		
		for(i = arrs.length-1,j=0; i >= 0;i--,j++)
		{
			revArray[j] = arrs[i];
			System.out.print(revArray[j]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int myArr[] = new int[] {10,20,30,40,50};
		System.out.println("The original array ");
		for(int i=0;i<myArr.length;i++)
		{
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		System.out.println("------------------");
		ReverseArray ray = new ReverseArray();
		ray.reverseArray(myArr);
	}
}
/*
 * ANOTHER METHOD
 * 
 * int st =0;
 *  int end =arr.length-1; 
 *  while (st<end) {
 *   int temp = arr[st];
 * arr[st]=arr[end];
 *  arr[end]=temp;
 *   st++;
 *    end--; 
 *    }
 */	


