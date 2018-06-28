import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {

    public static void main(String[] args) {
        int[] intArr = {212,34,5,6,67,8889,954,437,954,112,412};
        Scanner input = new Scanner(System.in);

        System.out.println("Array before BubbleSort");
        printArr(intArr);

        System.out.println("Array after bubbleSort");
        bubblesort(intArr);

    }

    static void printArr(int[] newArr){
        for (int x:newArr){
            System.out.print( " "+x);
        }
        System.out.println(" ");
    }

    static void bubblesort(int[] newArr){

        for (int j=0;j<newArr.length;j++){
            int temp;
            for(int x=0;x<newArr.length-1;x++){
                if(newArr[x+1] > newArr[x]){
                    temp = newArr[x];
                    newArr[x] = newArr[x+1];
                    newArr[x+1] = temp;
                }
                else{
                    newArr[x] = newArr[x];
                }
            }
        }

        printArr(newArr);
    }
}
