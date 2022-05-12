public class  BankAccount {
    private String acctName;
    private int acctNumber;
    private double balance;




    public BankAccount(String acctHolder,  int acctNum, double acctBalance){
        this.acctName = acctHolder;
        this.acctNumber = acctNum;
        this.balance = acctBalance;

    }

    public BankAccount(){

    }

    public String getAcctHolderName() {
        return this.acctName;

    }

    public void setAcctHolderName(String name) {
        this.acctName = name;
    }

    public double  getAcctBalance() {
        return this.balance;

    }

    public void setAcctBalance(double acctbal) {
        this.balance = acctbal;
    }

    public int getAcctNumber() {
        return this.acctNumber;

    }
    
    
// A deposit() method that has an amount of money to deposit as the parameter. Add that amount to the account balance.
public double deposit(double amountToDeposit) {
    return this.balance + amountToDeposit;

}

// A withdrawal() method that has an amount of money to withdraw as the parameter. Subtract that amount from the account balance.
public double withdrawal(double amountToWithdraw) {
    return this.balance - amountToWithdraw;

}

public double  transfer(double amountToTransfer, BankAccount acct) {
    withdrawal(amountToTransfer);
    acct.deposit(amountToTransfer);
        // this.balance -= amountToTransfer;
        // acct.balance += amountToTransfer;
    
    
    return acct.deposit(this.withdrawal(amountToTransfer));
}
}


