class Message {
    private String msg;
    private boolean hasMessage = false;  // true when message is available

    public synchronized String read() {
        while (!hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        hasMessage = false;
        notifyAll();
        return msg;
    }

    public synchronized void write(String msg) {
        while (hasMessage) {  // wait while there's already a message
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        this.msg = msg;
        hasMessage = true;
        notifyAll();
    }
}

class Writer extends Thread {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {
            "First message",
            "Second message",
            "Third message",
            "Fourth message"
        };

        for (String m : messages) {
            message.write(m);
            System.out.println("Wrote: " + m);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        message.write("Done");
        System.out.println("Wrote: Done");
    }
}

class Reader extends Thread {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true) {
            String msg = message.read();
            System.out.println("Read: " + msg);
            if ("Done".equals(msg)) {
                break;
            }
        }
    }
}

public class InterThreadCommunicationDemo {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        Message message = new Message();

        new Writer(message).start();
        new Reader(message).start();
    }
}