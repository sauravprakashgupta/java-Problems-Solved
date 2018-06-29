public class Fish extends Animals{
    private String name;
    public Fish(String _name){
        name = _name;
    }
    public void move(){
        System.out.println(name +" can swim");
    }

    @Override
    public String toString() {
        return name;
    }
}
