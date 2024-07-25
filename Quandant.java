import java.util.Scanner;

public class Quandant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the degree : ");
        int degree = scanner.nextInt();

        if (degree != 0 && degree != 90 && degree != 180 && degree != 270) {
            if (degree > 0 && degree < 90){
                System.out.println("Quandant 1");
            }
                else if (degree > 90 && degree < 180) {
                    System.out.println("Quandant 2");
                }
                else if (degree > 180 && degree < 270) {
                    System.out.println("Quandant 3");
            }
            else if (degree > 270 && degree < 360) {
                System.out.println("Quandant 4");
            }
                else {
                    System.out.println("Invalid value");
                }
            }
        else {
            switch (degree) {
                case 0: 
                    System.out.println("Positive Y axis");
                    break;
                    case 90:
                        System.out.println("Positive X axis");
                        break;
                        case 180:
                            System.out.println("negative Y axis");
                        break;
                        case 270:
                            System.out.println("negative X axis");
                        break;
                        case 360:
                            System.out.println("Positive  X axis");
                        break;
                default:
                System.out.println("Invalid degree");
                    break;
            }
        }


    }
    }