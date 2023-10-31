package additional_problems;

import java.util.Arrays;

public class LargestRectArea_InHistogram2 {

	public static void main(String[] args) {

		int arr[] = {2,2,2,2,2};
		Arrays.sort(arr);
		int size = arr.length;
		int max=0;
		for(int i=0;i<size;i++){
			if(max<size*arr[i])
				max=size*arr[i];
			size--;

		}
		if(max<arr[0])
			System.out.println(arr[0]);
		else
			System.out.println(max);
	}
}
