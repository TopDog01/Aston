class Helicopter extends AirTransport implements Propeller, Wings {
    public Helicopter() {
        super("Вертолет");
    }

    @Override
    public void move() {
        System.out.println(name + " летит.");
    }

    @Override
    public void hasPropeller() {
        System.out.println(name + " имеет винт.");
    }

    @Override
    public void hasWings() {
        System.out.println(name + " имеет крылья.");
    }
}