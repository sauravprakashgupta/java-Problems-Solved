public class Dog extends Animals{
    private String name;
    public Dog(String _name){
        name = _name;
    }
    public void move(){
        System.out.println(name +" can run");
    }

    @Override
    public String toString() {
        return name;
    }
}
