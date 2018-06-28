import java.util.Scanner;
public class RecursiveSum {

    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter valiue of n");
        int n = input.nextInt();
        boolean quit =false;
        if(n>9999 || n<0){
            System.out.println("Value not permitted, Retry or Quit");
            String enter =input.nextLine();
            if(enter.equalsIgnoreCase("quit")){
                quit = true;
            }
            else{
                quit = false;
            }
        }
        else {
            sum = SumN(n);
        }
        System.out.println("Sum = " + sum);
    }

    public static int SumN(int n){
        if(n==1){
            return 1;
        }
        else{
            return (n+ SumN(n-1));
        }
    }
}
