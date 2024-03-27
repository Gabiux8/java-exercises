
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOne, numTwo;
        System.out.println("Give the first number:");
        numOne = scan.nextInt();
        System.out.println("Give the second number:");
        numTwo = scan.nextInt();

if (numOne > numTwo) {
    System.out.println("Greater number is: " + numOne);
} else if (numTwo > numOne) {
    System.out.println("Great number is: " + numTwo);
} else {
    System.out.println("The numbers are equal!");
}

    }
}
