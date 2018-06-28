import javafx.beans.binding.NumberExpression;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CalenderMonthDay {

    public static void main(String[] args) {
        int sum = 0;
        int monthNumber = 2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Year");
        int year = input.nextInt();
        System.out.println("Type 1 for Jan, 2 for feb, and so on,.. till 12 for december");
        System.out.println("Enter Month Number");
        try{
            monthNumber = input.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Enter only Number :");
            System.out.println("The default month is Feb : ");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("The default month is Feb : ");
        }

        findYear(year,monthNumber);
    }
    public static void findYear(int year, int month){
        boolean leapYear =false;
        if(year%400 == 0 ||year%100 == 0 || year%4==0){
            System.out.println(year + " is a leap year");
            leapYear =true;
        }

        findMonth(month,leapYear);
        if(leapYear){
            System.out.println("Its is leap year");
        }
    }
    public static void findMonth(int month,boolean leapYear){
        switch (month){
            case 1:
                System.out.println("Month Name : January");
                System.out.println("Numer of days : 31");
                break;
            case 2:
                System.out.println("Month Name : February");
                if(leapYear == true){
                    System.out.println("Number of days : 29");
                }else{
                    System.out.println("Number of days : 28");
                }
                break;
            case 3:
                System.out.println("Month Name : March");
                System.out.println("Numer of days : 31");
                break;
            case 4:
                System.out.println("Month Name : April");
                System.out.println("Numer of days : 30");
                break;
            case 5:
                System.out.println("Month Name : May");
                System.out.println("Numer of days : 31");
                break;
            case 6:
                System.out.println("Month Name : June");
                System.out.println("Numer of days : 30");
                break;
            case 7:
                System.out.println("Month Name : July");
                System.out.println("Numer of days : 31");
                break;
            case 8:
                System.out.println("Month Name : August");
                System.out.println("Numer of days : 31");
                break;
            case 9:
                System.out.println("Month Name : September");
                System.out.println("Numer of days : 30");
                break;
            case 10:
                System.out.println("Month Name : October");
                System.out.println("Numer of days : 31");
                break;
            case 11:
                System.out.println("Month Name : November");
                System.out.println("Numer of days : 30");
                break;
            case 12:
                System.out.println("Month Name : December");
                System.out.println("Numer of days : 31");
                break;
        }
    }
}
