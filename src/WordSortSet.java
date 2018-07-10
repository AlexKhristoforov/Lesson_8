import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class WordSortSet {
    private Set<String> wordSortSet = new TreeSet<>(new LengthComparator());

    public void put(String text) {
        String[] temp = text.split(" ");
        wordSortSet.addAll(Arrays.asList(temp));
    }

    public void print() {
        for (String element : wordSortSet) {
            System.out.println(element);
        }
    }
}
