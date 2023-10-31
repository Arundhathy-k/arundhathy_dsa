package arraysample;

public class VariableArgSample {
	public void findSumAndAvgOfArray(int[] arr1)
	{
		
	}
	// variable no of arguments /
	public void varArgs(String name,String address,int... nums)
	{
		System.out.println("Welcome "+name+" You Reside at "+address);
		int sum = 0;
		for(int i =0;i<nums.length;i++)
		{
			sum += nums[i];
		}
		System.out.println("Your Total is "+sum);
	}
	public void add(int a,int b,int c)
	{
		int result = a + b + c;
		System.out.println("The Sum is "+result);
	}
	public static void main(String[] args) {
		VariableArgSample vas = new VariableArgSample();
	/*    vas.add(10,20,30);    */
		vas.varArgs("Kiran","RTNagar",10,20,30,40,50);
		vas.varArgs("Arjun","Kollam",100,200,300);
		vas.varArgs("Madan","pune",1,2,5,8);
		
	}
}
