import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1 = 1, n2=1;
        boolean flag = true;
        do{
            System.out.println("Type exit or quit to cancel operation");
            try{
                System.out.println("Enter First Number : ");
                String x1 = input.nextLine();
                if(x1.equalsIgnoreCase("quit") || x1.equalsIgnoreCase("exit")){
                    flag = false;
                    break;
                }
                n1 = Integer.parseInt(x1);
                System.out.println("Enter Second Number : ");
                String x2 = input.nextLine();
                if(x2.equalsIgnoreCase("quit") || x2.equalsIgnoreCase("exit")){
                    flag = false;
                    break;
                }
                n2 = Integer.parseInt(x2);
            }
            catch (InputMismatchException ex){
                System.out.println("Only Digits are allowed");
                System.out.println("using default values of 1 for wrong input");
            }
            catch (NumberFormatException ex){
                System.out.println("Only Digits are allowed");
                System.out.println("using default values of 1 for wrong input");
            }
            catch (Exception ex){
                System.out.println(ex);
            }
            int result = n1/n2;
            System.out.println(result);
        }
        while(flag == true);
    }
}
