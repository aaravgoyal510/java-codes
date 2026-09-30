class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        Thread thread = new Thread(new MyRunnable());
        thread.start(); // Starts the thread
    }
}
