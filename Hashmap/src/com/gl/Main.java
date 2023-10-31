package com.gl;

import java.util.Scanner;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     HashMap<String,String> map = new HashMap<>();
     String choice ;
     String username  ;
     String pwd ;
    while(true) {
          choice = sc.nextLine();
     switch (choice){
        case "add" :  username = sc.nextLine();
                      pwd = sc.nextLine();
                      map.put(username,pwd);;
                      break;
        case "remove" : username = sc.nextLine();
                        System.out.println(username);
                        map.remove(username);
                        break;
        case "get" : username = sc.nextLine();
                     System.out.println(map.get(username));
                      break;
        case "quit" : break;
        default: System.out.println("Invalid choice");
                 break;
     }
    }
    }    
}

