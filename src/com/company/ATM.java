package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    public static Scanner scanner = new Scanner(System.in);//reads keyboard input


    public static void main(String[] args) throws Exception { /* public (access) static (applies to all objects)
    void (returns nothing) main (method) array string (arguments). still says throws exception from before*/

        HashMap<String, Double> accounts = new HashMap();//creates hashmap with string name and double balance
       while (true) { //while a certain condition true, keeps running code in hashmap
           Customer hustler = new Customer(); //creates new customer object
           hustler.chooseName(); //runs choosename method on hustler object

           if (!accounts.containsKey(hustler.name)) { //checks to see if customer's name is in accounts hashmap
               System.out.println("Would you like to create an account?");
               String answer = scanner.nextLine();
               if (answer.equalsIgnoreCase("y")) { //if they say yes
                   accounts.put(hustler.name, hustler.balance); //put method adds name and balance to hashmap
               } else { //otherwise
                   continue; //keep running code from beginning
               }
           }
           else {
               hustler.balance = accounts.get(hustler.name); //getting balance from hustler's name in hashmap
               System.out.println("Your balance is" + hustler.balance);
           }

           while (true) {
               hustler.chooseTodo(); //todo method run on customer object hustler. refactored to customer class
               accounts.put(hustler.name, hustler.balance); //this puts info into hashmap after customer makes a todo choice
               if (hustler.todo.equalsIgnoreCase("Cancel")) { //f they choose cancel, breaks while loop and exits code
                   break;                                       //(because nothing listed after todo)
               }
               if (hustler.todo.equalsIgnoreCase("Remove account")) {
                   accounts.remove(hustler.name);
                   break;
                   //remove method to remove info from accounts hashmap. why only name
               }                                     //and not balance and also break out
           }
       }



    }


}
