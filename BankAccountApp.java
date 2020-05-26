import java.util.List;
import java.util.LinkedList;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        
        // Checkings chkacct = new Checkings("Tom Wilson", "123456789", 1500);

        // Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);

        // savacc1.compound();

        // savacc1.showInfo();
        // System.out.println( "**************************");
        // chkacct.showInfo();

        // savacc1.deposit(5000);
        // savacc1.withdraw(200);
        // savacc1.transfer("Brokerage", 3000);
        //read CSV file then create new acct based on data
        
        // read a CSV FILE then create now accts based on that data
        String file = "original.csv";
        List<String[]> newAccountHolders = CSV.read(file);
        for(String[] accountHolder : newAccountHolders) {
            System.out.println( "NEW ACCOUNT");
            String name = accountHolder[0];
            String ssn = accountHolder[1];
            String accountType = accountHolder[2];
            Double initDeposit = Double.parseDouble(accountHolder[3]);
            //System.out.println(name + " " + " " + ssn + " " + accountType + " " + initDeposit);
            // System.out.println(accountHolder[0]);
            // System.out.println(accountHolder[1]);
            // System.out.println(accountHolder[2]);
            // System.out.println(accountHolder[3]);
            if (accountType.equals("Saving")){
                // System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name, ssn, initDeposit));
            }else if (accountType.equals("Checking")){
                // System.out.println("OPEN A CHECKING ACCOUNT");
                accounts.add(new Checkings(name, ssn, initDeposit));
            }else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        for (Account acc : accounts){
            System.out.println("\n**********************");
            acc.showInfo();
        }
    }
    
}