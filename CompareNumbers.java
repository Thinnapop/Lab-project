import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            double smallestNum, middleNum, largestNum;
            
            if (num1 <= num2 && num1 <= num3) {
                smallestNum = num1;
                if (num2 <= num3) {
                    middleNum = num2;
                    largestNum = num3;
                } else {
                    middleNum = num3;
                    largestNum = num2;
                }
            } else if (num2 <= num1 && num2 <= num3) {
                smallestNum = num2;
                if (num1 <= num3) {
                    middleNum = num1;
                    largestNum = num3;
                } else {
                    middleNum = num3;
                    largestNum = num1;
                }
            } else {
                smallestNum = num3;
                if (num1 <= num2) {
                    middleNum = num1;
                    largestNum = num2;
                } else {
                    middleNum = num2;
                    largestNum = num1;
                }
            }
            
            System.out.println("arrange number: " + smallestNum + middleNum + largestNum);
            
        }
        
        scanner.close();
    }
}
