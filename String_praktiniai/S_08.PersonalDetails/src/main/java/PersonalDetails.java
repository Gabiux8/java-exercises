
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countIn = 0;
        int sumYear = 0;
        double averageYear = 0.0;

        int intName = 0;
        String name = "";

        while (true) {
            String in = scanner.nextLine();

            if (in.equals("")) {
                break;
            }
            String[] parts = in.split(",");

            countIn++;

            int tempYear = Integer.valueOf(parts[1]);

            sumYear += tempYear;

            int tempLength = Integer.valueOf(parts[0].length());
            String tempName = parts[0];
            if (intName < tempLength) {
                intName = tempLength;
                name = tempName;
            }
        }
        averageYear = 1.0 * sumYear / countIn;

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + averageYear);
    }
}
