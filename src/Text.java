import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Text {
    private static Logger LOGGER = Logger.getLogger(Text.class.getName());
    private String text;

    {
        FileHandler handler = null;
        try {
            handler = new FileHandler("logfile.txt");
            LOGGER.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOGGER.addHandler(handler);
    }


    public void input() {
        System.out.println("Input the string with some words:");
        Scanner in = new Scanner(System.in);
        this.text = in.nextLine();
        //this.text = "some very very interesting text";
    }

    public void sortedText() {
        WordSortSet wordSortSet = new WordSortSet();
        wordSortSet.put(text);
        wordSortSet.print();
    }

    public void wordsQuantity() {
        WordWithQuantitySet wordWithQuantitySet = new WordWithQuantitySet();
        wordWithQuantitySet.put(text);
        try {
            wordWithQuantitySet.searchWord();
        } catch (WordSetException e) {
            System.out.println(e.getMessage());
            LOGGER.log(Level.INFO, e.getMessage());
        }
    }
}
