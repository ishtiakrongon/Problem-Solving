package Very_Easy;
import java.util.Scanner;


public class problem1 {
    
    // Creating a method to find the sum of two numbers

    static int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int a, b;

        // Creating an instance variable for user input
        Scanner sc = new Scanner(System.in);

        // Taking first input
        System.out.println("Enter first digit: ");
        a = sc.nextInt();

        // Taking second input
        System.out.println("Enter second digit: ");
        b = sc.nextInt();

        System.out.println();

        sc.close();

        // add two values and print them
        System.out.println("The summation is: " + addition(a, b));
    }    

}