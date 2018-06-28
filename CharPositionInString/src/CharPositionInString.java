import java.util.Scanner;
public class CharPositionInString {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String : ");
        String word = input.nextLine();
        int strLength = word.length();
        char[] charArr = new char[strLength];

        for (int k=0;k<strLength;k++){
            charArr[k] = word.charAt(k);
        }

        for (int k=0;k<strLength;k++){
            System.out.println((k+1) + " letter is " + charArr[k]);
        }
    }
}