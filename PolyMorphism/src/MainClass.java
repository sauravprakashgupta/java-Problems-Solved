public class MainClass {
    public static void main(String[] args) {
        BaseClass[] myObject = new BaseClass[2];
        myObject[0] = new ChildClass1();
        myObject[1] = new ChildClass2();

        for(int x=0;x<myObject.length;x++){
            myObject[x].myFunc();
        }

        //Wait for it
        ChildClass1 childClass1 = new ChildClass1();
        ChildClass2 childClass2 = new ChildClass2();

        ConsumerClass consumerClass = new ConsumerClass();
        consumerClass.useMeFunc(myObject[0]);
        consumerClass.useMeFunc(myObject[1]);

        //Same as above

        consumerClass.useMeFunc(childClass1);
        consumerClass.useMeFunc(childClass2);

        //You can override the toString methods of child classes to get the Exact name, instead of hasv value of the object

        BaseClass baseToChild1Object = new ChildClass1();
        BaseClass baseToChild2Object = new ChildClass2();

        //A child object can always be of Parent type

        //Now I will use objects which are of type BaseClass but actually an object of Child Classes.

        consumerClass.useMeFunc(baseToChild1Object);
        consumerClass.useMeFunc(baseToChild2Object);


        //Now lets call childClass functions from Consumer Class

        System.out.println("------------------call childClass functions from Consumer Class---------------------------");

        ConsumerClass c1 = new ConsumerClass();
        c1.anotherFunction(myObject[0]);
        c1.anotherFunction(myObject[1]);
        c1.anotherFunction(childClass1);
        c1.anotherFunction(childClass2);
        c1.anotherFunction(baseToChild1Object);
        c1.anotherFunction(baseToChild2Object);

    }
}
