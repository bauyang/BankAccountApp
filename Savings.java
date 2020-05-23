public class Savings extends Account{
    // list prop specific to saving acct
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // constructor to int settings for saving prop
    public Savings(String name, String ssn, double initDeposit){
        super(name, ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        // System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        // System.out.println("NEW SAVINGS ACCOUNT");
        // System.out.println(name);

        setSafetyDepositBox();
    }

    @Override
    public void setRate(){
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }

    //list any methodes specific to savings acct
    public void showInfo(){
        System.out.println("ACCOUNT TYPE: Saving");
        super.showInfo();
        System.out.println(
            "Your Savings Account Features" + 
            "\n Safety Deposite Box ID: " + safetyDepositBoxID +
            "\n Safety Deposite Box Key: " + safetyDepositBoxKey
        );

    }
}