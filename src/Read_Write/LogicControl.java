package Read_Write;

import java.util.List;
public class LogicControl {
    private final List<String> texts;

    public LogicControl(List<String> Texts){  //Constructor with parameter
        texts = Texts;
    }

    // Returns total row
    public int RowCount(){
        int totalRow;
        totalRow = texts.size();
        return totalRow;
    }

    // Returns total character
    public int CharacterCount(){
        int count = 0;
        for (String word : texts) {
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) != ' ')
                    count++;
            }
        }
        return count;
    }

    // Returns total word
    public int WordCount(){
        int totalWord = 0;
        for (String text : texts) {
            if (text != null) {
                String[] words = text.trim().split("\\s+");
                for(int i = 0; i < words.length; i++) {
                    totalWord++;
                }
            }
        }
        return totalWord;
    }

    // Returns first longest word
    public String LongestWord(){
        String longestWord = null;
        for (String text : texts) {
            String[] words = text.trim().split("\\s+");
            for (String word: words) {
                if (longestWord == null || word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }
}