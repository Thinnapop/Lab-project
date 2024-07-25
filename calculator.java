import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your operator (\"Normal\" / \"Trigonometric\"): ");
        String choose = scanner.next();

        double finalDegree = 0.0;
        double result = 0.0;

        if (choose.equalsIgnoreCase("Normal")) {
            System.out.println("Enter your first number : ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter your second number : ");
            double num2 = scanner.nextDouble(); 

            System.out.println("Select the operator(+ , - , * , *)");
            char ope = scanner.next().charAt(0);

            switch (ope) {
                case '+': 
                    result = num1 + num2;
                    break;
                    case '-': 
                    result = num1 - num2;
                    break;
                    case '*': 
                    result = num1 * num2;
                    break;
                    case '/': 
                    if (num2 == 0) {
                        System.out.println("Can't divide by Zero");
                    }
                        else {
                            result = num1 / num2;
                    break;
                    }
                default:
                System.out.println("Invalid operator :( ");
                    break;
            }
            System.out.println("Your reult is : "+ result);
        }
        if (choose.equalsIgnoreCase("Trigonometric")) {
            System.out.print("sin / cos / tan / cosine / sec / cot : ");
            String trigonometry = scanner.next();
            System.out.print("Enter the degree value : ");
            int degree = scanner.nextInt();
            switch (trigonometry) {
                case "sin":
                    finalDegree = Math.sin(Math.toRadians(degree));
                    break;
                    case "cos":
                    finalDegree = Math.cos(Math.toRadians(degree));
                    break;
                    case "tan":
                    finalDegree = Math.tan(Math.toRadians(degree));
                    break;
                    case "cosine":
                    finalDegree = Math.sinh(Math.toRadians(degree));
                    break;
                    case "sec":
                    finalDegree = Math.cosh(Math.toRadians(degree));
                    break;
                    case "cot":
                    finalDegree = Math.tanh(Math.toRadians(degree));
                    break;
            
                default:
                System.out.println("Invalid value");
                    break;
            }
            System.out.println("Your reult is : "+ finalDegree);
        }
    }
}
