package service;

import model.InputData;
import model.Installment;
import model.Summary;

import java.util.List;

@SuppressWarnings("unused")
public interface PrintingService {

    String INTEREST_SUM = "SUMA ODSETEK: ";

    String OVERPAYMENT_PROVISION = "PROWIZJA ZA NADPŁATY: ";

    String OVERPAYMENT_REDUCE_RATE = "NADPŁATA, ZMNIEJSZENIE RATY";

    String OVERPAYMENT_REDUCE_PERIOD = "NADPŁATA, SKRÓCENIE OKRESU";

    String OVERPAYMENT_FREQUENCY = "SCHEMAT DOKONYWANIA NADPŁAT";

    String LOST_SUM = "SUMA STRAT: ";

    String INSTALLMENT_NUMBER = "NR: ";
    String YEAR = " ROK: ";
    String MONTH = " MIESIĄC: ";
    String DATE = " DATA: ";
    String MONTHS = " MIESIĘCY ";
    String INSTALLMENT = " RATA: ";
    String CAPITAL = " KAPITAŁ: ";

    String OVERPAYMENT = "NADPŁATA: ";
    String INTEREST = "ODSETKI: ";
    String LEFT_AMOUNT = " POZ. KWOTA: ";

    String LEFT_MONTHS = " POZ. MSCY: ";
    String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
    String MORTGAGE_PERIOD = "OKRES KREDYTOWANIA: ";

    String CURRENCY = " ZŁ ";
    String NEW_LINE = "\n";
    String PERCENT = "% ";

    void printInputDataInfo(final InputData inputData);

    void printInstallments(List<Installment> installments);

    void printSummary(Summary summary);
}
