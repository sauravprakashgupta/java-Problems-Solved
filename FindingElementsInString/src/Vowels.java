import java.util.Scanner;
import java.util.Random;
public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String sentence = input.nextLine();
        char[] vowels = {'a','e','i','o','u'};
        for(int x=0;x<vowels.length;x++){
            for (int y=0;y<sentence.length();y++){
                if(sentence.toLowerCase().charAt(y) == vowels[x]){
                    System.out.println(vowels[x] +" is present at " + (y+1) + " position");
                }
            }
        }
    }
}