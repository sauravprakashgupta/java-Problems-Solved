import java.util.Scanner;
public class ValidatingStringPatternsWithoutRegex {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isSpecialChar =false;
        boolean isUpperChar = false;
        boolean isLowerChar = false;
        boolean isNumber = false;
        System.out.println("Enter String, Must contain 1 capital, 1 small, 1 special chararcter and 1 number : ");
        String password = input.nextLine();
        char[] charArr = new char[password.length()];
        int[] intArr = new int[password.length()];
        for(int x=0;x<password.length();x++){
            charArr[x] = password.charAt(x);
            intArr[x] = (int)charArr[x];
        }


        for(int x=0;x<intArr.length;x++){

            if((intArr[x] >=33 && intArr[x] <=47) || (intArr[x] >=58 && intArr[x] <=64) || (intArr[x] >=91 && intArr[x] <=96)){
                isSpecialChar = true;
            }
            if(intArr[x] >=48 && intArr[x] <=57){
                isNumber =true;
            }
            if(intArr[x] >=65 && intArr[x] <=90){
                isUpperChar = true;
            }
            if(intArr[x] >=97 && intArr[x] <=122){
                isLowerChar = true;
            }
        }

        if(isLowerChar == true && isUpperChar == true && isNumber == true && isSpecialChar == true){
            System.out.println(" Perfect, you have entered correctly");
        }
        else if(isLowerChar == false){
            System.out.println("Enter a lowercase");
        }
        else if(isUpperChar == false){
            System.out.println("Enter a upperCase");
        }
        else if(isNumber == false){
            System.out.println("Enter a number");
        }
        else if(isSpecialChar == false){
            System.out.println("Enter a special character");
        }
        else{
            System.out.println("OOPS... you missed it ");
        }
    }
}