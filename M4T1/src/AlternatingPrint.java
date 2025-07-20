class AlternatingPrint {
    private static final Object lock = new Object();
    private static boolean isOneTurn = true;

    /**
     * Основной метод для запускания два потока для чередования вывода
     *
     * @param args
     */

    public static void main(String[] args) {
        Thread thread1 = new Thread( () -> {
            while (true) {
                synchronized (lock) {
                    while (!isOneTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("1");
                    isOneTurn = false;
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread( () -> {
            while (true) {
                synchronized (lock) {
                    while (isOneTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("2");
                    isOneTurn = true;
                    lock.notify();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}