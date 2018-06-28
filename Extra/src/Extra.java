import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1;
        try{
            n = input.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Only Digits allowed");
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        input.close();

        findMatrix(n);
    }
    static void findMatrix(int n){
        Random rand = new Random();

        for(int y =0;y<n;y++){
            for(int x=0;x<n;x++){
                System.out.print( " " + rand.nextInt(2));
            }
            System.out.println("");
        }
    }
}