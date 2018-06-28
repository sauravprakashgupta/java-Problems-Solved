//Java Exercises: Find the longest word in a text file

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Directory {
    public static void main(String [ ] args) throws FileNotFoundException {
        new Directory().findLongestWords();
    }

    public String findLongestWords() throws FileNotFoundException {

        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("C:\\Users\\SouravG\\Downloads\\saurav\\testFoleder\\testDoc.txt"));

        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }
        }
        System.out.println("\n"+longest_word+"\n");
        return longest_word;
    }
}