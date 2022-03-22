package code.datesAndCalender;

import java.util.Date;

public class TransactionTester {
    public static void main (String[] args) {
        Transaction transaction = new Transaction("Withdrawl", new Date(), "1111", 20.0);
        System.out.println(transaction);
    }
}
