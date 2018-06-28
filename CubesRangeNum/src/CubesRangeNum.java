import java.util.InputMismatchException;
import java.util.Scanner;
public class CubesRangeNum {

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = 10;
        try{
            num = input.nextInt();
        }
        catch(InputMismatchException ex){
            System.out.println("Only numbers are allowed");
        }
        catch(Exception ex){
            System.out.println("oops..."+ex);
        }
        cube(num);
    }

    public static void cube(int num){
        int count = 1;
        for(count =1;count <=num;count++){
            System.out.println("Cube of "+ count +" is " + (int)Math.pow(count,3));
        }
    }
}