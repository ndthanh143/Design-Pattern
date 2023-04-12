public class Object {
    private static Object instance;

    private Object() {};

    public static Object getInstance() {
        if(instance==null) {
            instance = new Object();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton~~~~");
    }
}
