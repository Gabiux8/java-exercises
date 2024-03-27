
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int number = scanner.nextInt();

        System.out.println("Give the second number:");
        int number2 = scanner.nextInt();
        scanner.close();

        int result = number * number2;


        System.out.println(number + " * " + number2 + " = " + result);
    }
}
