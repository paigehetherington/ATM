package com.company;

/**
 * Created by vajrayogini on 2/3/16.
 */
public class Customer {
    String name; //variable in customer class
    String todo;
    double balance = 100.0; //starting balance for everyone

    public void chooseName() throws Exception { //choose name method
        System.out.println("What is your name?");
        name = ATM.scanner.nextLine(); //response
        if (name.isEmpty()) { //if they don't respond
            System.out.println("Don't be shy, tell me your name...");
        }

    }
    public void chooseTodo() throws Exception {  //todo method
        System.out.println("What would you like to do? [Check balance/Withdraw funds/Deposit funds/Remove account/Cancel]");
        todo = ATM.scanner.nextLine();

        if (todo.equalsIgnoreCase("Check balance")) {
            System.out.println("Your balance is $" +  balance);
        } else if (todo.equalsIgnoreCase("Cancel")){
            System.out.println("Thank you and please come again.");
           // throw new Exception ("cancel");
        } else if (todo.equalsIgnoreCase("Withdraw funds")){
            System.out.println("How much money would you like to withdraw?");
            String withdrawal = ATM.scanner.nextLine(); //creates withdrawal string from their response
            int money = Integer.valueOf(withdrawal); //type conversion from string to int

            if (money <= balance) { //checks to see if they have enough $ to withdraw
                balance = balance - money;
                System.out.println("Please take your $" + money + " Your current balance is $"+balance);
            }
            else {
                System.out.println("You don't have that much sucker!");
            }
        }
        else if (todo.equalsIgnoreCase("Deposit funds")) {
            System.out.println("How much do you want to deposit?");
            String deposit = ATM.scanner.nextLine();
            int depositAmount = Integer.valueOf(deposit); //"
            balance = balance + depositAmount;
            System.out.println("You deposited $" +depositAmount +" Your new balance is $" +balance);
        }
        else if (todo.equalsIgnoreCase("Remove account")) {
            System.out.println("Thanks for letting us keep your money as long you did!");
        }
        else {
            throw new Exception ("That is not an option, please try again."); //if they type something other than an option
        }
    }



}
