package ArrayList_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class BrowserRedirection {
	
	LinkedList <String> history = new LinkedList<>();
	Scanner sc = new Scanner(System.in);
	int current = 0;

	public void implementUrlNavigation() {
		// 1. Add a default browser to the history
	   history.add("www.google.com");

		boolean b = true;
		while (b) {
			System.out.println(history);
			System.out.println("1. Visit new web page");
			System.out.println("2. Go back ");
			System.out.println("3. Go farward");
			System.out.println("4. Exit");

			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				newPage();
				break;
			case 2:
				goBack();
				break;
			case 3:
				goForward();
				break;
			case 4:
				b = false;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
	public void newPage() {
		System.out.println("Enter the url:");
		String url = sc.next();
		// 2. if currentUrl is pointing to the last page in history then insert the
		// new page at the end
		if (current == history.size() - 1) {
			history.add(url);
			current++;
		}
		// 3. If currentUrl is not pointing to the last page in history then clean the
		// history from currentUrl+1 to the end and insert the new page at the end
		else {
			history.subList(current + 1, history.size() - 1).clear();
			history.add(url);
			current++;
		}
		System.out.println("You are in "+ url);
	}

	public void goBack() {
		// 1. If currentUrl is not pointing to the first page then go back
		if (current != 1) {
			current--;
			System.out.println("You are in "+history.get(current--));
		}
		// 2. If currentUrl is pointing to the first page say that we cannot go back
		else {
			System.out.println("We cannot go back.");
			
		}
		
	}

	public void goForward() {
		// 1. If currentUrl is not pointing to the last page then go forward
		if (current != history.size() - 1) {
			current++;
			System.out.println("You are in "+history.get(current++));
		}
		// 2. If currentUrl is pointing to the last page say that we cannot go forward
		else {
			System.out.println("We cannot go forward.");
			System.out.println("You are in "+history.get(current));
		}
		
	}

	public static void main(String[] args) {
		BrowserRedirection browserRedirection = new BrowserRedirection();
		browserRedirection.implementUrlNavigation();
	}
}
