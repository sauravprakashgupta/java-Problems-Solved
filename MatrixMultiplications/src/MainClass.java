
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        System.out.println("Enter First array");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter :");
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter Second array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter : ");
                b[i][j] = input.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j] * b[i][j];
            }
        }

        System.out.println("The result is : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
