package Read_Write;

import java.util.List;
public class LogicControl {
    public boolean StopOrContinue(String text){
        if(text.equalsIgnoreCase("stop")){
            return true;
        }
        else {
            return false;
        }
    }
    public int RowCount(List<String> texts){
        int totalRow;
        totalRow = texts.size();  // Total index
        return totalRow;
    }
    public int CharacterCount(List<String> texts){
        int count = 0;
        for (String word : texts) {
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) != ' ')
                    count++;
            }
        }
        return count;
    }
    public int WordCount(List<String> texts){
        int totalWord = 0;
        for (String text : texts) {
            if (text != null || !text.isEmpty()) {
                String[] words = text.trim().split("\\s+");
                for (String word: words) {
                    totalWord++;
                }
            }
        }
        return totalWord;
    }
    public String LongestWord(List<String> texts){
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