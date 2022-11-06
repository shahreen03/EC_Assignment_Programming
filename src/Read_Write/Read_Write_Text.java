package Read_Write;

import java.util.Scanner;  // Import the Scanner class
import java.util.*;
public class Read_Write_Text {
    public static void main(String[] args) {
        System.out.println("Enter a text. ('stop to exit')");
        Scanner scanObj = new Scanner(System.in);  // Create a Scanner object
        LogicControl logicControl  = new LogicControl();
        int totalRow = 0;
        int totalCharacter = 0;
        int totalWord = 0;
        boolean isStop = false;
        String longestWord;
        List<String> texts=new ArrayList<String>();

        while(true) {
            String text = scanObj.nextLine();  // Read user input
            isStop = logicControl.StopOrContinue(text);
            if(isStop) {
                System.out.println("Quiting the program...");
                totalRow = logicControl.RowCount(texts);
                System.out.println("Total row: " + totalRow);  // Show total result
                totalCharacter = logicControl.CharacterCount(texts);
                System.out.println("Total character: " + totalCharacter);  // Show total result
                totalWord = logicControl.WordCount(texts);
                System.out.println("Total word: " + totalWord);  // Show total result
                longestWord =  logicControl.LongestWord(texts);
                System.out.println("Longest word: " + longestWord);  // Show total result
                break;  // Out from the loop
            }
            else{
                texts.add(text);
            }
        }
    }
}