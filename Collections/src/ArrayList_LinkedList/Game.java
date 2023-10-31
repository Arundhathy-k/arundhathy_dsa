package ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	 // 1. Declare all variables
	ArrayList<Integer> A = new ArrayList<>();
	ArrayList<Integer> B = new ArrayList<>();
	String str = " ";
	String str1 =" ";
	Scanner sc = new Scanner(System.in);
	
	 public void getData() {

		 System.out.println("Enter the string:");
		 str = sc.nextLine();
		
	 // 2. Create an array based on the take values
		 String[] arr = str.split(" ");
		 
	 // 3. Insert the values to the arraylist
		 for(int i=0;i<arr.length;i++) {
			 A.add(Integer.parseInt(arr[i]));
			 B.add(Integer.parseInt(arr[i]));
			 }
	}

	 public void playGame() {
		 int sizeA = A.size();
	        int sizeB = B.size();
	        int i = 0;
	        int j = sizeB - 1;

	        while (i < sizeA && j >= 0) {
	            int numA = A.get(i);
	            int numB = B.get(j);

	            if (numA > numB) {
	                B.remove(j);
	                str1 += " 0";
	            } else if (numA < numB) {
	                A.remove(i);
	                str1 += " 1";
	            } else {
	                A.remove(i);
	                B.remove(j);
	            }

	            sizeA = A.size();
	            sizeB = B.size();
	            i = 0;
	            j = sizeB - 1;
	        }

	 	 }
	 public static void main(String[] args) {
	 // 1. Create Object
		 Game obj = new Game();
	 // 2. Implement method/s
		 obj.getData();
		 obj.playGame();
	 //3. Print the result
		 System.out.println(obj.str1);
	 }
}
