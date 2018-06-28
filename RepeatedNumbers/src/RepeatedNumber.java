import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;
import java.util.Arrays;
public class RepeatedNumber {

    public static void main(String[] args) {
        int[] intArr = {12,43,65,24,64,24,677,95,11,12,677,88,64};
        Scanner input = new Scanner(System.in);

        for(int x=0;x<intArr.length;x++){
            for (int y=1;y<intArr.length; y++){
                if (intArr[x] == intArr[y] && x != y && y>x){
                    System.out.println(intArr[x] + " is present at position "+ (x+1));
                }
            }
        }
    }
}