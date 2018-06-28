import java.util.Scanner;
public class NumTriangle {

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i =1;i<=num;i++){
            for (int j=1; j<i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        for (int i =num-1;i>=0;i--){
            for (int j=1; j<i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}