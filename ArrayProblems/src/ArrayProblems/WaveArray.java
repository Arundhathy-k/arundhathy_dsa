package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=6;
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		waveform(arr, n);
		  sc.close();
	}	
  static void waveform(int[] arr,int n) {
    Arrays.sort(arr);
    for(int i=0;i<n;i+=2) {
    	int temp = arr[i];
    	arr[i]=arr[i+1];
    	arr[i+1]=temp;
    }
    System.out.println("WAVE ARRAY");
	  for(int tmp:arr) {
	    	System.out.print(tmp+" ");
	  }
}   
}
