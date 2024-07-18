import java.util.Scanner;

public class payroll{
    public static void main(String[] args) {

        double payRate = 6.75;
        double federalTax = 0.2;
        double stateTax = 0.09;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.next();

        System.out.println("How many hour do you work in this week");
        int hour = scanner.nextInt();

        
        double grossPay = payRate * hour;
        double federalWithHolding = grossPay * federalTax;
        double stateWithHolding = grossPay * stateTax;
        double totalDeduction = federalWithHolding + stateWithHolding;
        double netPay = grossPay - (federalWithHolding + stateWithHolding);

        System.out.println("Employee's name : "+name);
        System.out.println("Hours work : "+hour);
        System.out.println("Pay rate : "+payRate);
        System.out.println("Gross pay : "+grossPay);
        System.out.println("Deduction => (Federal,State)");
        System.out.println("Federal withholding : "+federalWithHolding);
        System.out.println("State withholding : "+stateWithHolding);
        System.out.println("Total deduction : "+totalDeduction);
        System.out.println("Net pay : "+netPay);

        scanner.close();
    }
}