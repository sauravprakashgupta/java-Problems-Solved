import java.util.Scanner;
public class NumTriangle3 {

    public static void main(String[] args) {
        int sum = 0, k=1;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i =1;i<=num;i++){
            for (int j=1; j<i; j++){
                System.out.print(k++ +" " );
            }
            System.out.println("");
        }
        for (int i =num;i>=0;i--){
            for (int j=1; j<i; j++){
                System.out.print(k++ +" " );
            }
            System.out.println("");
        }
    }
}