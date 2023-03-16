package Very_Easy;
import java.util.Scanner;

public class problem2 {
    
    static int convert(int minute) {
        int result;
        result = minute * 60;
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter time in minutes: ");
        int minute = sc.nextInt();

        // close input

        sc.close();

        System.out.println("Here, " + minute + " minute is equivalent to "
                            + convert(minute) + " seconds.");

    }

}
