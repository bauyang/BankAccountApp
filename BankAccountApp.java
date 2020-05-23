public class BankAccountApp {
    public static void main(String[] args) {
        
        Checkings chkacct = new Checkings("Tom Wilson", "123456789", 1500);

        Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);

        savacc1.showInfo();
        chkacct.showInfo();

        //read CSV file then create new acct based on data

    }
    
}