package ArrayProblems;

import java.util.Arrays;

public class MinDiffPair {
	    public static int[][] findMinDifferencePairs(int[] arr) {
	        if (arr.length < 2) {
	            System.out.println("The array must contain at least two elements.");
	            return new int[0][2];
	        }

	        Arrays.sort(arr);

	        int minDifference = Integer.MAX_VALUE;
	        for (int i = 1; i < arr.length; i++) {
	            int currentDifference = arr[i] - arr[i-1];
	            if (currentDifference < minDifference) {
	                minDifference = currentDifference;
	            }
	        }

	        int count = 0;
	        for (int i = 1; i < arr.length; i++) {
	            int currentDifference = arr[i] - arr[i-1];
	            if (currentDifference == minDifference) {
	                count++;
	            }
	        }

	        int[][] minDifferencePairs = new int[count][2];
	        int index = 0;
	        for (int i = 1; i < arr.length; i++) {
	            int currentDifference = arr[i] - arr[i-1];
	            if (currentDifference == minDifference) {
	                minDifferencePairs[index][0] = arr[i-1];
	                minDifferencePairs[index][1] = arr[i];
	                index++;
	            }
	        }

	        return minDifferencePairs;
	    }

	    public static void main(String[] args) {
	        int[] arr = {4, 2, 1, 3, 5, 6};
	        System.out.println("Pairs with minimum difference:");
	        int[][] pairs = findMinDifferencePairs(arr);

	        for (int[] pair : pairs) {
	            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
	        }
	    }
	}
 