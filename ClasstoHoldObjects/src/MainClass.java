public class MainClass {
    public static void main(String[] args) {
        AnimalList ALO = new AnimalList();

        Dog d = new Dog("Labrador");
        Fish f = new Fish("BubbleFish");

        ALO.add(d);
        ALO.add(f);

        Animals[] theAnimal = new Animals[2];
        theAnimal[0] = d;
        theAnimal[1] = f;

        theAnimal[0].move();
        theAnimal[1].move();
    }
}