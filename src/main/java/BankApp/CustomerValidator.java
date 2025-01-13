package BankApp;

public class CustomerValidator {

    public void validateCustomer(String customerName) throws InvalidCustomerException {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new InvalidCustomerException("İstifadəçi adı düzgün deyil!");
        }
        System.out.println("Müştəri adı doğrulandı: " + customerName);
    }
}
