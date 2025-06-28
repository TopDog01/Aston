public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.move();
        airplane.hasWings();

        Helicopter helicopter = new Helicopter();
        helicopter.move();
        helicopter.hasPropeller();
        helicopter.hasWings();

        Boat boat = new Boat();
        boat.move();

        Truck truck = new Truck();
        truck.move();
        truck.hasWheels();

        Taxi taxi = new Taxi();
        taxi.move();
        taxi.hasWheels();
    }
}