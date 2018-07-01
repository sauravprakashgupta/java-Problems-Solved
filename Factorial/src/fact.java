import java.util.Scanner;
import java.util.InputMismatchException;
public class fact {
    public static void main(String[] args) {
        long x =1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");

        try{
            x = input.nextInt();
        }catch (InputMismatchException ex){
            System.out.println("Wrong input .Only numbers are allowed for foctorial. Using 1 by default");
            x=1;
        }
        catch (Exception ex){
            System.out.println(ex);
        }

        long res = fact(x);
        System.out.println("the factorial of "+x+" is "+res );
    }
    public static long fact(long num){
        if(num == 1){
            return 1;
        }
        else {
            return num * fact(num-1);
        }
    }
}
