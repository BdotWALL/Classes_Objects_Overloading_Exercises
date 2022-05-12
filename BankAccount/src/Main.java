import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static   ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);


        BankAccount acct1 = new BankAccount("Paul James", 1, 500.0);
         BankAccount acct2 = new BankAccount("Michael Douglar", 2, 500_000.0);
         BankAccount acct3 = new BankAccount("Carl Pane", 3, 250_000.0);
         BankAccount acct4 = new BankAccount("Bob Cane", 4, 35_000.0);
         BankAccount acct5 = new BankAccount("Steve Wilkos", 5, 400_250.0);

        accounts.add(acct1);
        accounts.add(acct2);
        accounts.add(acct3);
        accounts.add(acct4);
        accounts.add(acct5);


        System.out.println("Hello! Welcome to the Bank of Wall!");
        System.out.println("Are you an existing customer? (0 to exit) \n 1. Yes \n 2. No");
        int answer = scan.nextInt();

while(true) {
        if(answer ==1) {
            System.out.println("Please enter your account number:");
            int acctsNum = scan.nextInt();
            boolean isAccountHolder = false;
            int index = -1;
            for (int i = 0; i < accounts.size(); i++) {
                BankAccount acct = accounts.get(i);
                if(acctsNum ==acct.getAcctNumber()) {
                    isAccountHolder = true;
                    index = i;
                }
            }

            if (isAccountHolder) {
                mainMenu(accounts.get(index));

            } else {
                System.out.println("Sorry, we couldn't find your account number");
            }

        }else if( answer ==2) {
            BankAccount newAcct = new BankAccount();
            System.out.println("Let's set you up an account");
            System.out.println("What is the name for the account?");
            String answerName = scan.nextLine();
            newAcct.setAcctHolderName(answerName);
            System.out.println("What is the begining balance?");
            double answerBalance = scan.nextDouble();
            newAcct.setAcctBalance(answerBalance);
            
            accounts.add(newAcct);
            
            mainMenu(accounts.get(accounts.size() -1));
                        

        }else if (answer == 0) {
            System.out.println("Goodbye! Have a good day!");   
            break;

        } 


    }
}

public static void mainMenu(BankAccount acct) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Hello " + acct.getAcctHolderName() + "!");
    System.out.println("Welcome to the Main Menu, what would you like to do today?");
    while(true) {
    System.out.println("1. Check Account Balance");
    System.out.println("2. Make a withdrawal");
    System.out.println("3. Make a deposit");
    System.out.println("4. Make a transfer");
    System.out.println(" o. Exit");
    int answer = scan.nextInt();

    if (answer ==1) {
        System.out.println("Check Balance Menu");
        acct.getAcctBalance();
        System.out.println("Your account balance is " + acct.getAcctBalance());

    } else if (answer ==2) {
        System.out.println("Withdraw Menu");
        System.out.println("Please enter the amount to withdraw");
        double withdrawAmount = scan.nextDouble();
        acct.withdrawal(withdrawAmount);
        System.out.println(" You withdrew $" + withdrawAmount + "." + "Your account balance is now " + acct.getAcctBalance());

    }else if (answer ==3) {
        System.out.println("Deposit Menu");
        System.out.println("Please enter the amount to deposit");
        double depositAmount = scan.nextDouble();
        acct.deposit(depositAmount);
        System.out.println(" You deposited $" + depositAmount + "." + "Your account balance is now " + acct.getAcctBalance());

        
    }else if (answer ==4) {
        System.out.println("Transfer Menu");
        System.out.println("Please enter the account number to transfer to:");
        int transferredTo = scan.nextInt();
        BankAccount toTransferTo = new BankAccount();
        boolean isAccountHolder = false;
         int index = -1;

        for (int i = 0; i < accounts.size(); i++) {
            BankAccount accts = accounts.get(i);
            if(transferredTo ==accts.getAcctNumber()) {
                toTransferTo = accts;
                isAccountHolder = true;
                index = i;
            }
        }

        if (isAccountHolder) {
            System.out.println("How much would you like to transfer?");
            int transferAmount = scan.nextInt();

            acct.transfer(transferAmount, toTransferTo);

            System.out.println("You transfered $" + transferAmount + " to" + toTransferTo.getAcctHolderName());

        } else {
            System.out.println("Sorry, couldn't find the account");
            break;

        }
        
    }else if (answer ==0) {

        System.out.println("Goodbye! Have a good day!");   
            break;
        
    }else {
        System.out.println("Invalid Entry");
        break;
    }
}


}
}
