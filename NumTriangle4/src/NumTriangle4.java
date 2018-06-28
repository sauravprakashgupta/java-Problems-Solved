import java.util.InputMismatchException;
import java.util.Scanner;
public class NumTriangle4 {

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int i,j,r=10;
        try{
            r = input.nextInt();
        }catch(InputMismatchException ex){
            System.out.println("Only numbers are allowed,... pattern printed for default value 10");
        }
        catch (Exception ex){
            System.out.println(ex);
        }


        for(i=0;i<=r;i++)
        {
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(i=r-1;i>=1;i--)
        {
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
