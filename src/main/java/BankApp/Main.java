package BankApp;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("54987", BigDecimal.valueOf(1000));
        CurrencyConverter converter = new CurrencyConverter();
        CustomerValidator validator = new CustomerValidator();

        try {
            validator.validateCustomer("Elmir");

            account.withdraw(BigDecimal.valueOf(200));

            BigDecimal convertedAmount = converter.convert(BigDecimal.valueOf(100), "USD", "EUR");
            System.out.println("Çevrilmiş məbləğ: " + convertedAmount);
        } catch (InvalidCustomerException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException | UnsupportedCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Bilinməyən xəta baş verdi: " + e.getMessage());
        }
    }
}
