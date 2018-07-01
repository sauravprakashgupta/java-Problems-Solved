//Armstrong number

import java.util.Scanner;
import java.math.*;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num1 = num;
        int counter = 0;
        int x = 0;
        while (num1 > 0) {
            num1 = num1 / 10;
            counter++;
        }

        int sum = calculateSum(counter,num);


        if(num == sum){
            System.out.println("Yes, it is");
        }
        else{
            System.out.println("No");
        }
    }
    public static int calculateSum(int c, int num2){
        int[] intArr = new int[c];

        for (int i = 0; i <= c; i++) {
            intArr[i] = num2 % 10;
            num2 = num2 / 10;
        }
        int sum = (int) (Math.pow(intArr[0],3) + Math.pow(intArr[1],3) + Math.pow(intArr[2],3));
        return sum;
    }
}
