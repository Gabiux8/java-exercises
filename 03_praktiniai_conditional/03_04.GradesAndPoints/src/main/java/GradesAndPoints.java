
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                System.out.println("Give points [0-100]: ");

                int a = Integer.valueOf(scan.nextLine());

                System.out.println("Grade: ");
                if (a < 0) {
                    System.out.println("impossible!");
                } else if(a <= 49) {
                    System.out.print("failed");
                } else if(a <= 59) {
                    System.out.print("1");
                } else if(a <= 69) {
                    System.out.print("2");
                } else if(a <= 79) {
                    System.out.print("3");
                } else if(a <= 89) {
                    System.out.print("4");
                } else if(a <= 100) {
                    System.out.print("5");
                } else if(a > 100) {
                    System.out.println("incredible!");
                }
    }
}
