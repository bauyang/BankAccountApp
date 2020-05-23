public class Savings extends Account{
    // list prop specific to saving acct
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // constructor to int settings for saving prop
    public Savings(String name, String ssn, double initDeposit){
        super(name, ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        // System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        // System.out.println("NEW SAVINGS ACCOUNT");
        // System.out.println(name);
    }
    //list any methodes specific to savings acct
    
}