package codesoft2;
import java.util.*;

class ATM {
    float Balance;
    int PIN = 1011;

    public void checkpin() {
        System.out.print("Enter Your PIN : ");
        @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
        int enterIN = sc.nextInt();
        if (enterIN == PIN) {

            menu();

        } else {
            System.out.println("Enter a valid PIN...!");
            checkpin();
        }
    }

    public void menu() {
        
        System.out.println(" ******************* Options *******************  ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.print("Enter Your Choice : ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                System.out.println("******************* Thank You *******************");
                System.out.println();
                System.out.println();
                return;
            default:
                System.out.println("Enter a valid Choice...!");
                break;
        }

    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Your Balance : " + Balance);
        System.out.println();
        System.out.print("Press 0 for exit OR Press 1 for menu : ");
        @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
        int lastchoice = sc.nextInt();

        switch (lastchoice) {
            case 0:
                System.out.println();
                System.out.println();
                System.out.println("******************* Thank you *******************");
                System.out.println();
                System.out.println();
                return;
            case 1:
                menu();
                break;
            default:
                System.out.println("Enter a valid Input...!");
                break;
        }
    }

    // withdraw Money 
    public void withdrawMoney() {
        System.out.print("Enter the Amount to Withdraw : ");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > Balance) {
            System.out.println("Insufficient Balance...!");
            System.out.println();
            System.out.print("Press 0 for exit OR Press 1 for menu : ");
            int lastchoice = sc.nextInt();

            switch (lastchoice) {
                case 0:
                
                System.out.println("******************* Thank You *******************");
                break;
                
                case 1:
                   
                menu();
                break;
                
                default:
                    System.out.println("Enter a valid Input...!");
                    break;
            }
        } else {
            Balance = Balance - amount;
            System.out.println("Money withdrawal Successful...!");
            System.out.println();
            System.out.print("Press 0 for exit OR Press 1 for menu : ");
            int lastchoice = sc.nextInt();

            switch (lastchoice) {
                case 0:
                     System.out.println("******************* Thank You *******************");
                    return;
                case 1:
                    menu();
                    break;
                default:
                    System.out.println("Enter a valid Input...!");
                    break;
            }
        }
    }

    // deposit money 
    public void depositMoney() {
        System.out.print("Enter the Amount to Deposit : ");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount < 0) {
            System.out.println("Invalid Input...!");
            System.out.println();
            System.out.print("Press 0 for exit OR Press 1 for menu : ");
            int lastchoice = sc.nextInt();

            switch (lastchoice) {
                
                case 0:
                
                System.out.println("******************* Thank You *******************");
                break;
                
                case 1:
                    
                menu();
                break;
                
                default:
                System.out.println("Enter a valid Input...!");
                break;
            }
        } else {
            Balance = Balance + amount;
            System.out.println("Money Deposited Successfully...!");
            System.out.println();
            System.out.print("Press 0 for exit OR Press 1 for menu : ");
            int lastchoice = sc.nextInt();
            switch (lastchoice) {
                
                case 0:
                    
                System.out.println("******************* Thank You *******************");
                break;
                
                case 1:
                
                menu();
                break;
                default:
                    System.out.println("Enter a valid Input...!");
                    break;
            }
        }
    }
}



public class ATMMachine {
	
	public static void main(String[] args) {

        System.out.println("******************* Welcome *******************");
        ATM obj = new ATM();
        obj.checkpin();
    }

}
