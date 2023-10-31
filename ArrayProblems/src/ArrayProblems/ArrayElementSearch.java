package ArrayProblems;

public class ArrayElementSearch {

	public int searchArrayElement(int array1[],int target)
	{
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int arrs[] = new int[] {10,20,30,40,50,60,70,80,90,100};
		int searchIndex;
		ArrayElementSearch aes = new ArrayElementSearch();
		searchIndex = aes.searchArrayElement(arrs, 40);
		System.out.println("The element 40 is found at : "+searchIndex);
		
		searchIndex = aes.searchArrayElement(arrs,60);
		System.out.println("Thw element 60 is found at : "+searchIndex);
		
		searchIndex = aes.searchArrayElement(arrs,160);
		if(searchIndex == -1)
		{
			System.out.println("The element is not found ..");
		}
	}

}
