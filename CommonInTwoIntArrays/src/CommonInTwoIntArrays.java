import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;
import java.util.Arrays;
public class CommonInTwoIntArrays {

    public static void main(String[] args) {
        int[] intArr1 = {12,43,65,24,64,24,677,95,11,12,677,88,64};
        int[] intArr2 = {1,3,6,4,64,4,67,5,11,2,6,8,4};
        Scanner input = new Scanner(System.in);

        for(int x=0;x<intArr1.length;x++){
            for (int y=0;y<intArr2.length;y++){
                if (intArr1[x] == intArr2[y]){
                    System.out.println(intArr1[x]);
                }
            }
        }

    }
}