import java.util.Scanner;

public class sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your radius : ");
        double radius = scanner.nextDouble();

        Double surfaceArea = 4* Math.PI * Math.pow(radius,2);
        Double volume = (4.0 / 3.0)* Math.PI * Math.pow(radius, 3);

        System.out.println("Your sphere surface area : "+surfaceArea);
        System.out.println("Your sphere volume : "+volume);
    }    
}
