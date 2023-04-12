public class Main {
    public static void main(String[] args) {
        Object object1 = Object.getInstance();
        Object object2 = Object.getInstance();
//        Object object1 = new Object();
//        Object object2 = new Object();
        if (object1.equals(object2)) {
            System.out.println("Unique Instance");
        }
    }
}