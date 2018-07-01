/*Lucky Number from Birthdate*/

/*Lucky number calculater(just calculates the sum of digits of the given date*/
import java.io.*;
import java.util.InputMismatchException;

class MainClass{

    public static void main(String arg[])throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the date(ddmmyyyy):");
        int number = 01010001;
        try{
            number =Integer.parseInt(br.readLine());
        }catch(InputMismatchException ex){
            System.out.println("Only digits are allowed.... using default 01010001");
        }

        int sum = number;
        while(sum > 9){
            sum = calculate(sum);
        }
        System.out.println("Your lucky number is:");
        System.out.println(sum);

    }

    private static int calculate(int x){
        int count = 0;
        int sum = 0;
        int copyX = x;
        while(x > 0){
            x=x/10;
            count ++;
        }
        for(int i=0;i<count;i++){
            sum += copyX%10;
            copyX /= 10;
        }

        return sum;
    }
}
