abstract class Mammal implements IAnimal {
    @Override
    public void haveSpine() {
        System.out.println("Это млекопитающее имеет позвоночник.");
    }
    public abstract void hasFur();

    @Override
    public abstract void liveInWater();
}
