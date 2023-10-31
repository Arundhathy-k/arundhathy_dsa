package com.gl;

import java.util.HashMap;
import java.util.Scanner;

public class PasswordVerification {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<>();
		 String[] usernames = {
	                "jSmith23", "mJohnson77", "aBrown91", "eWilson42", "lThompson55",
	                "user123", "johnDoe", "soccerfan", "kittylover", "gamer123"
	            };

	            String[] passwords = {
	                "P@ssw0rd!", "Secure&Str0ng!", "Protect3d&Safe!", "2FaCt0r#Auth!", "IronCl@d#Defence!",
	                "password123", "johnDoe123", "soccerfan1", "ilovekittens", "gaming123"
	            };
	            for(int i=0;i<usernames.length;i++) {
	            	String username = usernames[i];
	                String password = passwords[i];	
	            map.put(username,password);
	            	}
	            
	            System.out.println(map);
	            System.out.println();
	            while(true) {
	           System.out.println("Enter the username: ");
	           String usrn = sc.nextLine();
	           System.out.println("Enter the password: ");
	           String pwd = sc.nextLine();
	           if(map.containsKey(usrn) && map.containsValue(pwd)) {
	        	   System.out.println("Access granted");
	           }
	           else if (!map.containsValue(pwd)) {
	        	   System.out.println("Invalid password");
	           }
	           else if(!map.containsKey(usrn)) {
	        	   System.out.println("Invalid username");
	           }
	}

}
}