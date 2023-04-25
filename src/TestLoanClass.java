import java.util.Scanner;

public class TestLoanClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Получить годовую процентную ставку
        System.out.print("Введите годовую процентную ставку, например, 45,7: ");
        double annualInterestRate = input.nextDouble();

        // Получить срок кредита в годах
        System.out.print("Введите срок кредита в годах: ");
        int numberOfYears = input.nextInt();

        // Получить сумму кредита
        System.out.print("Введите сумму кредита в рублях: ");
        double loanAmount = input.nextDouble();

        // Создать объект типа Loan
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Отобразить дату взятия, ежемесячный платеж и общую стоимость кредита
        System.out.println("\nДата взятия кредита: " + loan.getLoanDate());
        System.out.println("Ежемесячный платеж составляет: " + (int)(loan.getMonthlyPayment() * 100) / 100.0 + " руб.");
        System.out.println("Общая стоимость кредита составляет: " + (int)(loan.getTotalPayment() * 100) / 100.0 + " руб.");
    }
}
