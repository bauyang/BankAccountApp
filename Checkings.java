public class Checkings extends Account{
//List properties specific  to a checking acct
    int debitCardNumber;
    int debitCardPin;

//constructor to intialize checkint acct properties
public Checkings(String name, String ssn, double initDeposit) {
    super(name, ssn, initDeposit);
    accountNumber = "2" + accountNumber;
    // System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
    // System.out.println("NEW CHECKING ACCT");
    // System.out.println("NAME: " + name);
}

//list any methods specific to the checking acct
}