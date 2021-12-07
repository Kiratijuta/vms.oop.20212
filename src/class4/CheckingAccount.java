package class4;

public class CheckingAccount {

    String owner;
    double balance;
    static int counter;

    void printBalance() {
        double magnitude = (balance < 0) ? -balance : balance;
        String balanceRep = (balance < 0) ? "(" : "";
        balanceRep += String.format("%,.2f", magnitude);
        balanceRep += (balance < 0) ? ")" : "";

        String message = String.format("Name: %s, Balance: %s BTC", owner, balanceRep);
        System.out.println(message);
//        System.out.println("Name: " + owner + ", Balance: " + balanceRep + " BTC");
    }

    /**
     * @author Kiratijuta
     * @param amount
     * @return new balance
     */
    double deposit(double amount) {
        balance += amount;
        return balance;
    }

    double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

}
