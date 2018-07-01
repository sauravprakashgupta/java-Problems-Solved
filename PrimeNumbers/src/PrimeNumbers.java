import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int checkFlag = 0;
        while(checkFlag ==0){
            System.out.println("Lower range, Enter Number");
            int a = input.nextInt();
            System.out.println("Upper range, Enter Number");
            int b = input.nextInt();
            if(a>b || b == 0){
                System.out.println("Wrong Input try again");
                checkFlag = 0;
            }
            else{
                for(long i=a;i<b;i++){
                    primeFunc(i);
                    checkFlag = 1;
                }
            }
        }
    }

    public static void primeFunc(long a){
        long num = a;
        boolean isPrime = true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println(num);
        }
    }
}
