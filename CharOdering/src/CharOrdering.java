import java.util.*;
import java.util.Scanner;

public class CharOrdering {
    public static int ones =0;

    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        char[] charArr = new char[word.length()];
        for(int i=0;i<word.length();i++){
            charArr[i] = word.charAt(i);
        }
        char t;
        for(int j=0;j<word.length()-1;j++) {
            for (int k = 0; k < word.length() - 1 - j; k++) {
                if (charArr[k] > charArr[k + 1]) {
                    t = charArr[k];
                    charArr[k] = charArr[k + 1];
                    charArr[k + 1] = t;
                }
            }
        }
        for(char x : charArr){
            System.out.print(x);
        }

    }
}

