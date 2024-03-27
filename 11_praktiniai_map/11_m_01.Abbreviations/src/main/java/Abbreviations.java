import java.util.HashMap;
import java.util.Locale;

public class Abbreviations {
    private HashMap<String, String> dir;

    public Abbreviations() {
        this.dir = new HashMap<>();
    }

    public void addAbbreviation(String abb, String exp) {
        //abb = sanitizeString(abb);
        //exp = sanitizeString(exp);
        if (dir.containsKey(abb)) {
            System.out.println("Abbreviations already in!");
        } else {
            dir.put(abb, exp);
        }
    }

    public boolean hasAbbreviation(String abb) {

        return dir.containsKey(abb);
    }

    public String findExplanationFor(String abb) {
        if (dir.containsKey(abb)) {
            return dir.get(abb);
        }
        return null;
    }

    public static String sanitizeString(String in) {
        if (in == null) {
            return "";
        }

        in = in.toLowerCase();
        return in.trim();
    }
}
