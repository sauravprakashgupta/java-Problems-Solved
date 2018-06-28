import java.util.Scanner;
public class HashCode {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String : ");
        String word = input.nextLine();
        System.out.println("hash code is "+word.hashCode());
    }
}