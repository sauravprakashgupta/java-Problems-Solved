/*Angle and quadrant*/

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class MainClass
{
    /**
     Calculate the quadrant of an angle.
     */
    public static void main (String[] args)
    {

        int angle = 0;
        System.out.println("Type an integer angle (in degrees) and press Enter:");
        Scanner sc = new Scanner(System.in);
        angle= sc.nextInt();
        int value =0;

        int quadrant =0;
        if(angle > 360){
            angle = angle % 360;
            value = angle / 360;
        }

        if(angle>=0 && angle <=90){
            quadrant = 1;
        }
        else if(angle >90 && angle <=180){
            quadrant = 2;
        }
        else if(angle >180 && angle <=270){
            quadrant = 3;
        }
        else if(angle >270 && angle <=360){
            quadrant = 4;
        }

// output
        System.out.println("Quadrant is:" + quadrant);

    }
}
