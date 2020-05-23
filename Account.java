public abstract class Account implements IBaseRate {
        //List common properties for savings and checkings acct
        String name;
        String ssn;
        double balance;
        
        static int index = 10000;
        String accountNumber;
        double rate;
        
    

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
        
    }

    private String setAccountNumber(){
        String lastTwoOfSSN = ssn.substring(ssn.length()-2, ssn.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random()*Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    //List common methods
    public void showInfo(){
        System.out.println(
            "NAME: " + name +
            "\nACCOUNT NUMBER: " + accountNumber +
            "\n BALANCE: " + balance
        );
    }
}