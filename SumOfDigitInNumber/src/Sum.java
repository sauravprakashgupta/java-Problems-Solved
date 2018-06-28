import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num =0;
        try{
            num = input.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Only digits are allowed");
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        calculate(num);
    }
    private static void calculate(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n=n/10;
        }
        System.out.println("Sum = "+ sum);

    }
}