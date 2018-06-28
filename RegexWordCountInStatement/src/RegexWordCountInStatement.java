import java.util.Scanner;
public class RegexWordCountInStatement {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter statement: ");
        String word = input.nextLine();

        int countWords = 0;
        String[] c = word.split("\\s");

        for (String p:c){
            System.out.println(p);
            countWords++;
        }
        System.out.println("No. Of words : "+countWords);
    }
}