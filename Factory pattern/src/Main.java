public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
//        Nếu không xài Factory pattern
//        boss.viewBMW();
//        boss.viewHonda();
//        boss.viewMercedes();
//        Nếu xài factory pattern
        boss.viewCar("HONDA");
        boss.viewCar("MERCEDES");
        boss.viewCar("BMW");
    }

}