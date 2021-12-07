package class4;

public class CheckingAccountMain {

    public static void main(String[] args) {
        CheckingAccount member1 = new CheckingAccount();
        member1.owner = "Fair";
        member1.balance = 1000;
        member1.counter += 1;

        CheckingAccount member2 = new CheckingAccount();
        member2.owner = "James";
        member2.balance = -500;
        member2.counter += 1;

        System.out.println("Total Account is " + CheckingAccount.counter);

        member1.deposit(12005);
        member1.withdraw(8);
        member2.deposit(8665);

        member1.printBalance();
        member2.printBalance();
    }
}
