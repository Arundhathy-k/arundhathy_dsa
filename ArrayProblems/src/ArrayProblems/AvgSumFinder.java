package ArrayProblems;

public class AvgSumFinder {
	
	 public void findAvgAndSum(int[] arrs)
	 {
		 int sum = 0;
		 double avg = 0.0;
		 for(int i=0;i<arrs.length;i++)
		 {
			 sum += arrs[i];
		 }
		 avg = sum/arrs.length;
		 System.out.println("The sum of the elements :"+sum);
		 System.out.println("The avg of the elements :"+avg);
	 }
	 public static void main(String[] args) {
		 int arr[] = new int[] {10,20,30,40,50,60};
		AvgSumFinder asf = new AvgSumFinder();
		asf.findAvgAndSum(arr);
	 }
}
