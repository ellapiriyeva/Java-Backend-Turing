package BankApp;

import java.math.BigDecimal;

public class CurrencyConverter {

    public BigDecimal convert(BigDecimal amount, String fromCurrency, String toCurrency) {
        if (!isSupportedCurrency(fromCurrency) || !isSupportedCurrency(toCurrency)) {
            throw new UnsupportedCurrencyException("Bu valyuta dəstəklənmir!");
        }

        // Example conversion rates
        BigDecimal rate = getConversionRate(fromCurrency, toCurrency);
        return amount.multiply(rate);
    }

    private boolean isSupportedCurrency(String currency) {
        return currency.equals("USD") || currency.equals("EUR") || currency.equals("AZN");
    }

    private BigDecimal getConversionRate(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) return BigDecimal.valueOf(0.85);
        if (fromCurrency.equals("USD") && toCurrency.equals("AZN")) return BigDecimal.valueOf(1.7);
        if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) return BigDecimal.valueOf(1.18);
        if (fromCurrency.equals("EUR") && toCurrency.equals("AZN")) return BigDecimal.valueOf(2.0);
        if (fromCurrency.equals("AZN") && toCurrency.equals("USD")) return BigDecimal.valueOf(0.59);
        if (fromCurrency.equals("AZN") && toCurrency.equals("EUR")) return BigDecimal.valueOf(0.5);
        return BigDecimal.ONE;
    }
}
