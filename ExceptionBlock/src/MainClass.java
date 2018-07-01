class MainClass {
    static void play()throws Exception{
        System.out.println("before in main Class");
        throw new IllegalAccessException("I m in Main Class");//System.out.println("after");
    }
    public static void main(String args[]){
        try{
            play();
        }
        catch(Exception e)
        {
            ThrowsDemo td = new ThrowsDemo();
            td.play();
            System.out.println("caught me : "+e);
        }
    }
}
