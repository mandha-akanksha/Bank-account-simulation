package Day5_task;

import java.util.Scanner;

public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create account
        System.out.print("Enter account holder name: ");
        String name = scanner.next();
        System.out.print("Enter initial deposit amount: Rs. ");
        double initialBalance = scanner.nextDouble();

        Account account = new Account(name,initialBalance);

        while(true){
        
            System.out.println("-----------------------------------");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Transaction History\n5. Exit");

            System.out.println("Choose option: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1 :{
                    System.out.print("Enter deposit amount: Rs. ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                }
                break;
                case 2 :{
                    System.out.print("Enter withdraw amount: Rs. ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                }
                break;
                case 3 :{
                   account.checkBalance();
                    
                }
                break;
                case 4:{
                    account.showTransactionHistory();
                }
                break;
                case 5 :{
                    System.out.println("Thank you");
                    return;

                }
                

                default:{
                    System.out.println("Invalid choice");
                }
                  
            }
        }
    }
}
