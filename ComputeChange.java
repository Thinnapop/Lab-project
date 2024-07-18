import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter an amount in double, for example, 11.56: ");
        int amount = input.nextInt();

        int remainingAmount = (int) (amount * 100);


        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + remainingAmount + " cents");
    }
}