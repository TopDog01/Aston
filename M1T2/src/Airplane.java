class Airplane extends AirTransport implements Wings {
    public Airplane() {
        super("Самолет");
    }

    @Override
    public void move() {
        System.out.println(name + " летит.");
    }

    @Override
    public void hasWings() {
        System.out.println(name + " имеет крылья.");
    }
}