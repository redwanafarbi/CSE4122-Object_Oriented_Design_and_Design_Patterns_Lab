public class Single_Object {
    private static Single_Object instance = new Single_Object();

    private Single_Object(){}

    public static Single_Object getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }
}
