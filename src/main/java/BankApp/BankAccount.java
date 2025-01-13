package BankApp;

import java.math.BigDecimal;

public class BankAccount {

    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(balance) > 0) {
            throw new InsufficientBalanceException("Balans kifayət etmir!");
        }
        balance = balance.subtract(amount);
        System.out.println("Yeni balans: " + balance);
    }
}
