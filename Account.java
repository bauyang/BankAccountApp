public abstract class Account implements IBaseRate {
        //List common properties for savings and checkings acct
        private String name;
        private String ssn;
        private double balance;
        
        private static int index = 10000;
        //cant make private bc subclasses wont have access to it
        protected String accountNumber;
        protected double rate;
        
    

    //constructor to se base properties and initialize the acct
    public Account(String name, String ssn, double initDeposit){
        // System.out.println("NAME: " + name);
        // System.out.print("NEW ACCOUNT:");
        this.name = name;
        this.ssn = ssn;
        this.balance = initDeposit;
        // System.out.println("NAME: " + name + " SSN: " + ssn + " BALANCE: $ " + balance);

        //set acct number
        index++;
        this.accountNumber = setAccountNumber();
        // System.out.println(getBaseRate()); 
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = ssn.substring(ssn.length()-2, ssn.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random()*Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interested: $" + accruedInterest);
    }

    //List common methods
    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }
    public void transfer(String toWhere, double amount){
        balance -= amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now $" + balance);
    }
    public void showInfo(){
        System.out.println(
            "NAME: " + name +
            "\nACCOUNT NUMBER: " + accountNumber +
            "\nBALANCE: " + balance +
            "\nRate: " + rate + "%"
        );
    }
}