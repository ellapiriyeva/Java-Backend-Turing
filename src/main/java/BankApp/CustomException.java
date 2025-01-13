package BankApp;

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class UnsupportedCurrencyException extends RuntimeException {
    public UnsupportedCurrencyException(String message) {
        super(message);
    }
}

class InvalidCustomerException extends Exception {
    public InvalidCustomerException(String message) {
        super(message);
    }
}
