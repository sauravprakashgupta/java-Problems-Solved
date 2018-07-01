// Example using throws
class ThrowsDemo{
    static void play(){
        try{
            System.out.println("before in ThrowsDemo");
            throw new IllegalAccessException("I m in ThrowsDemo Class");//System.out.println("after");
        }
        catch(Exception e){
            System.out.println("Exception e"+e);
        }
    }
    public static void main(String args[]) throws Exception {
        play();
    }
}
