import java.util.Date;

public class Loan {
    private double annualInterestRate = 2.5;  // годовая процентная ставка по кредиту (по умолчанию: 2.5%)
    private int numberOfYears = 1;      // срок кредита в годах (по умолчанию: 1)
    private double loanAmount = 1000;   // сумма кредита (по умолчанию: 1000 рублей)
    private java.util.Date loanDate;    // дата взятия кредита

    /**
     * default constructor
     */
    public Loan() {
    }

    /**
     * main constructor
     *
     * @param annualInterestRate interest rate
     * @param numberOfYears      credit term
     * @param loanAmount         credit amount
     */
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();

    }

    /* Возвращаем годовую процентную ставку этого кредита */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /* Присваиваем новую годовую процентную ставку по этому кредиту */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /* Возвращаем срок этого кредита */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /* Присваиваем новый срок по этому кредиту */
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    /* Возвращаем сумму этого кредита */
    public double getLoanAmount() {
        return loanAmount;
    }

    /* Присваиваем новую сумму по этому кредиту */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /* Возвращаем дату взятия этого кредита */
    public Date getLoanDate() {
        return loanDate;
    }

    /* Вычисляет и возвращает ежемесячный платеж по этому кредиту */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    /* Вычисляет и возвращает общую стоимость этого кредита */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * getNumberOfYears() * 12;
        return totalPayment;
    }
}
