public class BankAccountApp {
    public static void main(String[] args) {
        
        Checkings chkacct = new Checkings("Tom Wilson", "123456789", 1500);

        Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);

        savacc1.compound();

        savacc1.showInfo();
        System.out.println( "**************************");
        chkacct.showInfo();

        // savacc1.deposit(5000);
        // savacc1.withdraw(200);
        // savacc1.transfer("Brokerage", 3000);
        //read CSV file then create new acct based on data
        

    }
    
}