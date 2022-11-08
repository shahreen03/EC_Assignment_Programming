package Read_Write;

import java.util.Scanner;  // Import the Scanner class
import java.util.*;
public class Read_Write_Text {
    public static void main(String[] args) {
        System.out.println("Enter a text. ('stop to exit')");
        Scanner scanObj = new Scanner(System.in);  // Create a Scanner object
        int totalRow;
        int totalCharacter;
        int totalWord;
        String longestWord;
        List<String> texts = new ArrayList<>();

        while (true) {
            String text = scanObj.nextLine();  // Read user input
            if(text.equalsIgnoreCase("stop")) {
                LogicControl logicControl = new LogicControl(texts); // Create LogicControl object
                System.out.println("Quiting the program...");
                totalRow = logicControl.RowCount();
                System.out.println("Total row: " + totalRow);  // Show total result
                totalCharacter = logicControl.CharacterCount();
                System.out.println("Total character: " + totalCharacter);  // Show total result
                totalWord = logicControl.WordCount();
                System.out.println("Total word: " + totalWord);  // Show total result
                longestWord = logicControl.LongestWord();
                System.out.println("First longest word: " + longestWord);  // Show total result
                break;
            }
            else {
                texts.add(text);
            }
        }
    }
}