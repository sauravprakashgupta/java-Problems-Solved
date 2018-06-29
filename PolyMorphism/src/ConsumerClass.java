public class ConsumerClass {
    public void useMeFunc(BaseClass b){
        System.out.println("Ok, I m the consumer class, and you have passed " + b + " object to me");
    }

    public void anotherFunction(BaseClass b){
        b.myFunc();
    }
}
