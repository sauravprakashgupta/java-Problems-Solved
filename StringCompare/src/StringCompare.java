import java.util.Scanner;
public class StringCompare {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Word1 : ");
        String inputString1 = input.nextLine();
        System.out.println("Enter Word2 : ");
        String inputString2 = input.nextLine();

        boolean isContain = false;

        isContain = inputString1.contains(inputString2);

        if (isContain==true){
            System.out.println("yes, same strings");
        }
        else{
            System.out.println("no, different strings");
        }

    }
}