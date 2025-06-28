class Truck extends AbstractTransport implements Wheels {
    public Truck() {
        super("Грузовик");
    }

    @Override
    public void move() {
        System.out.println(name + " едет.");
    }

    @Override
    public void hasWheels() {
        System.out.println(name + " имеет колеса.");
    }
}