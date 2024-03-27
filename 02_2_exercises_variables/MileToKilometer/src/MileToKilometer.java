import java.util.Scanner;

public class MileToKilometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles: ");
        int mile = scanner.nextInt();
        double kilometer = mile * 1.6;

        System.out.println(mile + " mile is " + kilometer + " Kilometers");
        scanner.close();
    }
}
