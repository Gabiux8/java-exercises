import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {

    public static boolean moreThanOnce(ArrayList<Integer> list, int searched) {
        // write your code here
        boolean found = false;
        int aux = 0;
        int i = 1;
        while (list.size() > i) {
            if (list.get(i) == searched) {
                found = true;
                aux = i;
            }
            i++;
        }
        i = 1;
        while (list.size() > i) {
            if (list.get(i) == searched && found == true) {
                if (aux != i) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }
    }
}