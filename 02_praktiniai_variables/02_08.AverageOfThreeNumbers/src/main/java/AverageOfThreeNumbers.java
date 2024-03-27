
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        int a,b,c,sum;
        System.out.println("Give the first number: ");
        a = scanner.nextInt();
        System.out.println("Give the second number: ");
        b = scanner.nextInt();
        System.out.println("Give the third number: ");
        c = scanner.nextInt();
        sum=a+b+c;
        double avg = sum / 3.0;
        System.out.println("The average is " +avg);
    }
}
