package Very_Easy;
import java.util.Scanner;


public class problem4 {
    
    static double area(double base, double height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of a triangle: ");
        double base = sc.nextDouble();

        System.out.println("Enter the height of a triangle: ");
        double height = sc.nextDouble();

        sc.close();

        System.out.println("The area of the triangle is: " + area(base, height));
    }

}
