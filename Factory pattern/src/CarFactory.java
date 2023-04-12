public class CarFactory {
    public void viewCar(String carType) {
        Car car;
        if(carType.equalsIgnoreCase("HONDA")) {
            car = new Honda();
            car.view();
        }
        if(carType.equalsIgnoreCase("MERCEDES")) {
            car = new Mercedes();
            car.view();
        }
        if(carType.equalsIgnoreCase("BMW")) {
            car = new BMW();
            car.view();
        }
    }
}
