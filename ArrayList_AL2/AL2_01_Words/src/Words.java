import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            } else {
                words.add(word);
            }
        }
        System.out.println("");
        System.out.println("You typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
