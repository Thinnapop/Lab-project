import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate : ");
        double annualInterestRate = scanner.nextDouble();
        
        System.out.print("Enter number of years: ");
        int numberOfYears = scanner.nextInt();

        double futureValue = investmentAmount * Math.pow(1 + annualInterestRate / 100, numberOfYears);
        
        System.out.printf("The future value is: " + futureValue);
        
        scanner.close();
    }
}
