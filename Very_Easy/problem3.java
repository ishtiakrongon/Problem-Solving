package Very_Easy;
import java.util.Scanner;


public class problem3 {
    
    static int incrementValue(int num) {

        return num + 1;
    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter digit: ");
        int a = sc.nextInt();

        System.out.println("Incremented digit is " + incrementValue(a));

    }
}
