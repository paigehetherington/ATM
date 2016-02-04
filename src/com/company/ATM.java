package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws Exception {

        HashMap<String, Double> accounts = new HashMap();
       while (true) {
           Customer hustler = new Customer();
           hustler.chooseName();

           if (!accounts.containsKey(hustler.name)) {
               System.out.println("Would you like to create an account?");
               String answer = scanner.nextLine();
               if (answer.equalsIgnoreCase("y")) {
                   accounts.put(hustler.name, hustler.balance);
               } else {
                   hustler.chooseName();
               }
           }
           else {
               hustler.balance = accounts.get(hustler.name);
               System.out.println("Your balance is" + hustler.balance);
           }
           hustler.chooseTodo();
           accounts.put(hustler.name, hustler.balance); //this puts info into hashmap after customer makes a todo choice
           if (hustler.todo.equalsIgnoreCase("Cancel")) {
               break;
           }
           if (hustler.todo.equalsIgnoreCase("Remove account")) {
               accounts.remove(hustler.name);
           }
       }


    }


}
