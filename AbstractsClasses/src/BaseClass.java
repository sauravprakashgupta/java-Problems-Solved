abstract public class BaseClass {
    public abstract void myFunc();
//    You have to override all the abstract methods, but overriding the non-abstract methods is not a hard rule

    public void concreteMethod(){
        System.out.println("This is a concrete method inside Abstract class");
    }
}
