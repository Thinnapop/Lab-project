import java.util.Scanner;

public class CAMTshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] discountRate = {
                { 0.02, 0.05 },
                { 0.03, 0.08 },
                { 0.05, 0.10 },
        };
        System.out.print("Enter your price : ");
        double totalPrice = scanner.nextDouble();

        System.out.println("Enter your membership status( Silver, Gold)");
        String membership = scanner.next();

        double discount = 0.0;

        if (membership.equalsIgnoreCase("Silver")) {
            if (totalPrice <= 1000) {
                discount = discountRate[0][0];
            } else if (totalPrice > 1000 && totalPrice <= 10000) {
                discount = discountRate[1][0];
            } else if (totalPrice > 10000) {
                discount = discountRate[2][0];
            }
        } else if (membership.equalsIgnoreCase("Gold")) {
            if (totalPrice <= 1000) {
                discount = discountRate[0][1];
            } else if (totalPrice > 1000 && totalPrice <= 10000) {
                discount = discountRate[1][1];
            } else if (totalPrice > 10000) {
                discount = discountRate[2][1];
            }
        }
        double amoutToPay = totalPrice * (1 - discount);

        System.out.println("You have to pay : " + amoutToPay + "Baht");

    }

}
