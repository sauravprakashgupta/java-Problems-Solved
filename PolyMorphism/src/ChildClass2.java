/**
 * Created by SouravG on 29-06-2018.
 */
public class ChildClass2 extends BaseClass {
    //Overidding the myFunc of base class
    void myFunc(){
        System.out.println("The Child class 2 is Stupid");
        //This function is capable of taking any BaseClass object or Object of any class that inherit BaseClass(like Child Class1 and Child Class2)
    }
}
