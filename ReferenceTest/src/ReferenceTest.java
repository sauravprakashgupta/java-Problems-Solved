//check if two numbers are same upto 3 decimal digits

import java.util.Scanner;
public class ReferenceTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b;
        a = input.nextDouble();
        b = input.nextDouble();

        a = a *1000;
        b = b *1000;

        int x = (int)(a);
        int y = (int)(b);

        if(x == y){
            System.out.println("yes, same upto 3 digits after decimal");
        }
        else{
            System.out.println("No, atleast not simmilar upto 3 decimal placrs");
        }
    }
}