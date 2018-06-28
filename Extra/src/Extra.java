import java.util.Scanner;
import java.util.Random;
public class Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        uglyNum(num);
    }
    static void uglyNum(int n){
        if(n%2==0 || n%3==0 || n%5==0){
            System.out.println("Yes it is a an Ugly Number");
        }
        else{
            System.out.println("No");
        }
    }
}