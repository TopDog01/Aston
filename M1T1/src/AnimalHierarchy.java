public class AnimalHierarchy {
    public static void main (String[] args) {
        Cat myCat = new Cat();
        Bear myBear = new Bear();
        Whale myWhale = new Whale();
        Fish myFish = new Fish();

        System.out.println("Кошка:");
        myCat.haveSpine();
        myCat.hasFur();


        System.out.println("\nМедведь");
        myBear.haveSpine();
        myBear.hasFur();

        System.out.println("\nКит");
        myWhale.liveInWater();
        myWhale.haveSpine();

        System.out.println("\nРыба");
        myFish.liveInWater();
        myFish.haveSpine();

    }
}