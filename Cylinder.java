import java.util.Scanner;
//----------Lab 3
//----------(Thinnapop Srisomboon and 672115019.)
//This program for calculate the area of regtangle
public class Cylinder {
    public static void main(String[] args) {
        double radius;
        double pie;
        double area;
        double volume;
        double length;
        pie = 3.1428;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius:");
        radius = input.nextDouble();
        System.out.print("Enter length:");
        length = input.nextDouble();

        area = radius * radius * pie;
        volume = area * length;

        System.out.println("Your Cylinder Area is : "+area);
        System.out.println("Your Cylinder Volume is : "+volume);

        
    }
}
