import java.util.Scanner;
import java.util.Arrays;
public class Extra {

    public static void main(String[] args) {
        int[] intArr = new int[5];
        Scanner input = new Scanner(System.in);
        for(int x=0;x<intArr.length;x++){
            intArr[x] = input.nextInt();
        }

        System.out.println("Enter Number to search");
        int num = input.nextInt();
        int[] contains = new int[2];
        contains = findNum(num,intArr);

        if(contains[0] == 1){
            System.out.println("Yes "+ num + " is present in the list");
            System.out.println(num + " is present at position " + contains[1]);
        }
        else{
            System.out.println(" No " +num+ " its not present in the list");
        }

    }

    public static int[] findNum(int n,int[] arr){
        int[] find = new int[2];
        find[0] = -1;
        find[1] = -1;
        for(int x=0;x<arr.length;x++){
            if(n==arr[x]){
                find[0] = 1;
                find[1] = x;
            }
        }
        return find;
    }
}
