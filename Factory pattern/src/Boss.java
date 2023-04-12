public class Boss {
//  Nếu không xài factory pattern
//    public void viewHonda() {
//        Honda honda = new Honda();
//        honda.view();
//    }
//    public void viewMercedes() {
//        Mercedes mercedes = new Mercedes();
//        mercedes.view();
//    }public void viewBMW() {
//        BMW bmw = new BMW();
//        bmw.view();
//    }
// Nếu xài Factory pattern
    public void viewCar(String carType) {
        CarFactory carFactory = new CarFactory();
        carFactory.viewCar(carType);
    }
}
