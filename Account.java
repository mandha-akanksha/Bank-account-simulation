package Day5_task;

import java.util.ArrayList;
//Account class
public class Account {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;

    //constructor
    public Account(String accountHolder, double initialBalance){

        this.accountHolder = accountHolder;
        this.balance=initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with initial balance: Rs. "+ initialBalance);
    }

    //Deposit Money
    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            transactionHistory.add("Deposited: Rs. "+amount);
            System.out.println("Successfully deposited Rs." +amount);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }

    //Withdraw Money
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){

            balance = balance-amount;
            transactionHistory.add("Withdrew: Rs. " +amount);
            System.out.println("Successfully withdrew Rs. "+amount);
        }else if(amount > balance){
            System.out.println("Insufficient balance");
        }else{
            System.out.println("Invalid withdrawal amount");
        }
    }

    //check balance
    public void checkBalance(){
       System.out.println("Current Balance: Rs. "+balance);
    }

    //show transaction history
    public void showTransactionHistory(){
        System.out.println("Transaction History");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

}
