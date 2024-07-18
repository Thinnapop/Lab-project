import java.util.Scanner;
//----------Lab 3
//----------(Thinnapop Srisomboon and 672115019.)
//This program for calculate the area of regtangle
public class Rectangle {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length:");
        length = input.nextInt();
        System.out.print("Enter width:");
        width = input.nextInt();
        area = length*width;
        System.out.println("Rectangle Area = "+area);
    }
}
