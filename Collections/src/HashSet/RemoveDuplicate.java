package HashSet;

import java.util.HashSet;

public class RemoveDuplicate {
	
	// Hashset not allows duplicate
	
	public static void main(String[] args)
	{
	int a[]={1,1,1,2,3,5,5,5,6,6,9,9,9,9};
	HashSet<Integer> hs = new HashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
	hs.add(a[i]);
	}
	for(int i:hs)
	{
	System.out.print(i+" ");
	}
}
}
