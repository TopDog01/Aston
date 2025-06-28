class Taxi extends AbstractTransport implements Wheels {
    public Taxi() {
        super("Такси");
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
