import java.util.Comparator;

public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        if (str1.length() == str2.length()) {
            if (str1.equals(str2)) return 0;
            else return str1.compareToIgnoreCase(str2);
        } else if (str1.length() > str2.length()) return 1;
        else return -1;
    }
}