package ArrayProblems;

import java.util.Scanner;

public class MaxAvgSubArray {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size:");
	        int n = sc.nextInt();
	        System.out.println("Enter the elements:");
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) 
	            arr[i] = sc.nextInt();
	        System.out.println("Enter the k value:");
	        int k = sc.nextInt();
	        System.out.println(window(arr,n,k));
	     sc.close();   
	    }
	    public static double window(int[] arr,int n,int k){
	    	if(k>n)
	    		return -1;
	        double sum=0;
	        for(int i=0;i<k;i++)
	            sum +=arr[i];
	        double max=sum;
	        for(int i=k;i<n;i++){
	            sum = sum+arr[i]-arr[i-k]; 
	          if(max<sum)
	          max=sum;
	        }
	         return max/k;
	    }
}
