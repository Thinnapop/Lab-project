import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of seconds: ");
        int seconds = input.nextInt();

        int day = seconds / 86400;
        int secondsRemaining = seconds % 86400;

        int hours = secondsRemaining / 3600;
        secondsRemaining = secondsRemaining % 3600;

        int minutes = secondsRemaining / 60;
        int remainingSeconds = secondsRemaining % 60;

        System.out.println(day + " day " + hours + " hour " + minutes + " minute  " + remainingSeconds + " second");
    }
}
