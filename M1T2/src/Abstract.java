abstract class AbstractTransport implements Transport {
    protected String name;

    public AbstractTransport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

abstract class WaterTransport extends AbstractTransport {
    public WaterTransport(String name) {
        super(name);
    }
}

abstract class AirTransport extends AbstractTransport {
    public AirTransport(String name) {
        super(name);
    }
}
