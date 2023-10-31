package ArrayProblems;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int newLength = removeDuplicates(arr);

        System.out.println(newLength);
        
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

	private static int removeDuplicates(int[] arr) {
		
		int i=0,j=0,counter=0,len=0,x=0;
        while(j<arr.length) {	
            if(arr[i]==arr[j]){
                counter++;
                if(counter<=2){                       // element can occur only twice in array
                    arr[x++]=arr[i];
                    len++;
                }
                j++;
            }
            else {
            	i=j;
            	counter = 0;
            }
        }
        
         return len;
	}
}
