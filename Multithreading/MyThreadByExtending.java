class MyThreadByExtending extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        MyThreadByExtending thread = new MyThreadByExtending();
        thread.start(); // Starts the thread
    }
}
