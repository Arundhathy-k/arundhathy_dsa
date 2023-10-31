package ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentNames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of students:");
		
		int n = sc.nextInt();

		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the first name: ");	
		String name = sc.next();
		list.add(name);
		}
		 // 4. Sort the list (Hint: Can use sort function from collection framework)
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
		sc.close();
	}

}
