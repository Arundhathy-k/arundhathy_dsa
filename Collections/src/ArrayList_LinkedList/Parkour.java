package ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class Parkour {

	ArrayList <Integer> list = new ArrayList<>();
	int maxEnergy=0;
	Scanner sc = new Scanner(System.in);
	
	public void getData() {
		System.out.println("Enter the no.of heights:");
		
		int n = sc.nextInt();
		System.out.println("Enter the heights: ");	
		for(int i=0;i<n;i++) {	
		int heights = sc.nextInt();
		list.add(heights);
	}
	}
	public void findMaxEnergy() {
		for (int i = 0; i <list.size(); i++) {
			int energy = 0;
			for (int j = i + 1; j < list.size(); j++) {
				energy ^= list.get(i) ^ list.get(j);
				if (list.get(j) < list.get(i)) {
					break;
				}
				if (energy > maxEnergy) {
					maxEnergy = energy;
				}
			}
		}
	}

	public static void main(String[] args) {
		Parkour obj = new Parkour();		
		obj.getData();
		obj.findMaxEnergy();

		System.out.println("max is: " + obj.maxEnergy);
	}
}
