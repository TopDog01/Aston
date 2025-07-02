abstract class Mammal implements Animal {

    @Override
    public boolean hasSpine() {
        return true;
    }

    public abstract boolean hasFur();
}
