package class5;

import java.text.ParseException;

public class Exercise2 {

    public static void main(String[] args) throws ParseException {

        CashVoucher cv1 = new CashVoucher("9101A00129309", 100, "30/12/2021");
        cv1.redeem(60);
        cv1.redeem(20);
        cv1.printBalance();
        cv1.redeem(40);

        boolean isValid = cv1.checkValidity();
        System.out.println(isValid);

    }

}
