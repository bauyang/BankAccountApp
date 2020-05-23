public class Checkings extends Account{
//List properties specific  to a checking acct
    private int debitCardNumber;
    private int debitCardPin;

//constructor to intialize checkint acct properties
public Checkings(String name, String ssn, double initDeposit) {
    super(name, ssn, initDeposit);
    accountNumber = "2" + accountNumber;
    // System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
    // System.out.println("NEW CHECKING ACCT");
    // System.out.println("NAME: " + name);

    setDebitCard();
}

@Override
public void setRate(){
    rate = getBaseRate() * .15;
}

//list any methods specific to the checking acct
private void setDebitCard() {
    debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
    debitCardPin = (int)(Math.random()* Math.pow(10, 4));
    System.out.println("CARD: " + this.debitCardNumber);
    System.out.println("PIN: " + this.debitCardPin);
}


@Override
public void showInfo(){
    super.showInfo();
    System.out.println("Your Checking Account Teatures" +
    "\n Debit Card Number: " + debitCardNumber +
    "\n Debit Card PIN: " + debitCardPin);
}
}