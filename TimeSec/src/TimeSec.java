import java.util.Scanner;
public class TimeSec {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        do{
            System.out.println("Enter seconds");
            int i = input.nextInt();
            if(i>999999999 || i<0){
                System.out.println(" Wrong Input, try again");
            }
            else{
                check = true;
                System.out.println("minutes entered " + i);
                int minutes = i/60;
                int hours = minutes/60;
                int day = hours/24;
                int year = day/12;
                int onlySeconds = i%60;
                int onlyMinutes = minutes%60;
                int onlyHours = hours%60;
                int onlyDay = day/24;
                int onlyYear = year/365;

                System.out.println("year : "+onlyYear
                        + "\nday : "+onlyDay
                        +"\nhours : " + onlyHours
                        + "\nminutes " +onlyMinutes
                        + "\nseconds " + onlySeconds);
            }
        }while(check == false);
    }
}
