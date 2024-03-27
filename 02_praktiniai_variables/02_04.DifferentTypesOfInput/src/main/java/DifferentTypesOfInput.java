
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string: ");
        String message = scan.nextLine();
        System.out.println("Give an integer:");
        int value = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double value1 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        /*boolean value2 = Boolean.valueOf(scan.nextLine());*/
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + message);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + value1);
        System.out.println("You gave the boolean " + trueOrFalse);


        /*String text = scan.nextLine();
int integer = Integer.valueOf(scan.nextLine());
double floatingPoint = Double.valueOf(scan.nextLine());


        System.out.println("Write a boolean ");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value);*/


    }
}
