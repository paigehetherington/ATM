package com.company;

/**
 * Created by vajrayogini on 2/3/16.
 */
public class Customer {
    String name;
    String todo;
    String money;

    public void chooseName() throws Exception {
        System.out.println("What is your name?");
        name = ATM.scanner.nextLine();
        if (name.isEmpty()) {
            throw new Exception("Don't be shy, tell me your name...");
        }

    }
    public void chooseTodo() throws Exception {
        System.out.println("What would you like to do? [Check balance/Withdraw funds/Cancel]");
        todo = ATM.scanner.nextLine();

        if (todo.equalsIgnoreCase("Check balance")) {
            System.out.println("Your balance is $100");
        } else if (todo.equalsIgnoreCase("Cancel")){
            System.out.println("Thank you and please come again.");
        } else if (todo.equalsIgnoreCase("Withdraw funds")){
            System.out.println("How much money would you like to withdraw?");
            String withdrawal = ATM.scanner.nextLine();
            int money = Integer.valueOf(withdrawal);

            if (money <= 100) {
                System.out.println("Please take your money.");
            }
            else {
                throw new Exception("You don't have that much sucker!");
            }
        }
    }



}
