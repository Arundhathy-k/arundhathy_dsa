package ArrayProblems;

import java.util.Scanner;

public class WaveAraay_2 {
	
//  NEGATIVE VALUES ALTERNATIVELY COMES
//	INPUT----> 2 1 3 -4 -1 4
//	OUTPUT---> -4 2 -1 1 3 4

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 6;
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		waveform(arr, n);
		sc.close();

	}

	static void bringForward(int[] arr, int i, int j) {
		int val = arr[j];
		while (j != i) {
			arr[j] = arr[j - 1];
			j--;
		}
		arr[i] = val;
	}

	static void waveform(int[] arr, int n) {
		int foundMisplace = -1;
		for (int i = 0; i < n; i++) {
			if (foundMisplace == -1) {
				if (i % 2 == 0) {
					if (arr[i] >= 0)
						foundMisplace = i;
				}
				if (i % 2 == 1) {
					if (arr[i] < 0)
						foundMisplace = i;
				}
			} else {
				if (foundMisplace % 2 == 0 && arr[i] < 0) {
					bringForward(arr, foundMisplace, i);
					i = foundMisplace + 2;
					foundMisplace = -1;
				} else if (foundMisplace % 2 == 1 && arr[i] >= 0) {
					bringForward(arr, foundMisplace, i);
					i = foundMisplace + 2;
					foundMisplace = -1;
				}
			}
		}
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}

	}

}
