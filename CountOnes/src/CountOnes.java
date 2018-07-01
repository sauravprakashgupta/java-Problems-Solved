/*count number of 1's between a range*/
import java.util.*;

public class CountOnes {
    public static int ones =0;
    static int count = 0;

    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Lower Limit");
        int a = input.nextInt();
        System.out.println("Enter Upper limit");
        int b = input.nextInt();
        CountOnes(a,b);
    }
    private static void CountOnes(int x, int y)
    {
        int j =0;
        for(int i=x;i<=y;i++){
            j=i;
            while (j>0) {
                if (j % 10 == 1) {
                    count++;
                }
                j = j / 10;
            }
        }
        System.out.println("total count : " + count);
    }
}