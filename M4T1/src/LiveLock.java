public class LiveLock {
    static class Farmer {
        private boolean hasCarrot;

        /**
         * Конструктор, создающий фермера с определенным состоянием.
         *
         * @param hasCarrot состояние, есть ли у фермера морковка
         */

        public Farmer(boolean hasCarrot) {
            this.hasCarrot = hasCarrot;
        }

        /**
         * Метод для обмена морковкой с другим фермером
         *
         * @param other другой фермер
         */

        public void exchange(Farmer other) {
            while (true) {
                if (this.hasCarrot && !other.hasCarrot) {
                    System.out.println("Farmer 1 gives carrot to Farmer 2");
                    other.hasCarrot = true;
                    this.hasCarrot = false;
                    break;
                } else if (this.hasCarrot && other.hasCarrot) {
                    System.out.println("Farmer 2 gives carrot to Farmer 1");
                    other.hasCarrot = false;
                    this.hasCarrot = true;
                    break;
                }
                System.out.println("Farmers are in a live lock situation");
            }
        }
    }

    /**
     * Основной метод для запуска два потока.
     *
     * @param args аргументы командной строки (не используются)
     */

    public static void main(String[] args) {
        Farmer farmer1 = new Farmer(true);
        Farmer farmer2 = new Farmer(false);

        Thread t1 = new Thread(() -> farmer1.exchange(farmer2));
        Thread t2 = new Thread(() -> farmer2.exchange(farmer1));

        t1.start();
        t2.start();
    }
}
