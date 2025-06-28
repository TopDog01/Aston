class Boat extends WaterTransport {
    public Boat() {
        super("Катер");
    }

    @Override
    public void move() {
        System.out.println(name + " плывет.");
    }
}