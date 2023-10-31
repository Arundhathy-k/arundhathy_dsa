package arraysample;

public class ArraySampleClass {
	
	int arr1[] = new int[10];
	public void populateArray()
	{
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = (i+1) * 10;
			System.out.println("Element is "+arr1[i]);
		}
	}
	
	public void manipulate2DArray()
	{
		int arrs[][] = new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
			   arrs[i][j] = (i+j) * 10;
			   System.out.print(arrs[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public void stringArray()
	{
		String[][] strArr = new String[][] { {"A","B","C","D"},{"E","F","G","H"},{"I","J","K","L"} };
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(strArr[i][j]+" ");
			}
			System.out.println();
			System.out.println("-----------------------------");
		}
	}
	
	public static void main(String[] args) {
		ArraySampleClass asc = new ArraySampleClass();
/*		asc.populateArray(); 
		asc.stringArray(); */
		asc.manipulate2DArray();
	}

}
