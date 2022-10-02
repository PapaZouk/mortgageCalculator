package model;

import java.math.BigDecimal;

public class InstallmentAmounts {

    /* Obiekt raty przechowujący informacje:
        - o jej wielkości,
        - stopie procentowej,
        - pozostałej kwocie kredytu do spłaty

     */

    private final BigDecimal installmentAmount;

    private final BigDecimal interestAmount;

    private final  BigDecimal capitalAmount;

    public InstallmentAmounts(
            BigDecimal installmentAmount,
            BigDecimal interestAmount,
            BigDecimal capitalAmount)
    {
        this.installmentAmount = installmentAmount;
        this.interestAmount = interestAmount;
        this.capitalAmount = capitalAmount;
    }

    public BigDecimal getInstallmentAmount() {
        return installmentAmount;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public BigDecimal getCapitalAmount() {
        return capitalAmount;
    }
}