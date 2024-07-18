import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        double dollar;
        double thai;
        double rate;
        double result;

        rate = 31.8245;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your money : ");
        dollar = input.nextDouble();
        result = dollar * rate;
        System.out.println("You have : "+result);
    }
    
}
