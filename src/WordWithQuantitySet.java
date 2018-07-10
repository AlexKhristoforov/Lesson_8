import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordWithQuantitySet {
    private Map wordWithQuantitySet = new HashMap();

    public void put(String text) {
        String[] temp = text.split(" ");
        for (String element : temp) {
            wordWithQuantitySet.put(element, quantity(temp, element));
        }
    }

    private int quantity(String[] array, String element) {
        int counter = 0;
        for (String word : array) {
            if (word.equals(element)) counter++;
        }
        return counter;
    }

    public void searchWord() throws WordSetException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the word for searching:");
        Object quantity = wordWithQuantitySet.get(scanner.nextLine());
        if (quantity == null) {
            throw new WordSetException("There are no such words in the text!");
        } else System.out.printf("The word is %d times in the text.\n", quantity);
    }
}
