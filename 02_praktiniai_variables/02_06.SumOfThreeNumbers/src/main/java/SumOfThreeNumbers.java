
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int x, y, z, sum;
        System.out.println("Give the first number: ");
        x = scanner.nextInt();

        System.out.println("Give the second number:");
        y = scanner.nextInt();

        System.out.println("Give the third number:");
        z = scanner.nextInt();

        sum = x + y + z;
        System.out.println("The sum of the numbers is " + sum);
    }
}
