import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your work hours : ");
        int workHours = scanner.nextInt();

        int wage1 = 8;
        int wage2 = 12;
        int totalWage;

        if (workHours <= 40 ) {
            totalWage = wage1 * workHours;
            System.out.println("You recieve 8$ per hours and your total wage are : "+totalWage+"$");
        }
        else {
            totalWage = (wage2 * (workHours-40) ) + 320;
            System.out.println("You recieve 12$ per hours and your total wage are : "+totalWage+"$");
        }
    }
}
