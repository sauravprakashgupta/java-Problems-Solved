//palindrome

import java.util.Scanner;
import java.math.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int wordLength = word.length();
        int flag = -1;
        char[] wordCharacters = new char[wordLength];
        wordCharacters = word.toCharArray();

        for (int i = 0; i < wordLength; i++) {
            if (wordCharacters[i] == wordCharacters[wordLength - 1] && wordLength >= i && wordLength != i) {
                flag = 0;
            } else {
                flag = 1;
            }
            wordLength--;
        }

        if (flag == 0) {
            System.out.println("This Word is Pallindrome");
        } else {
            System.out.println("No this is not pallindrome");
        }
    }
}
