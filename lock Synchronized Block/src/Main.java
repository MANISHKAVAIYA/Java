import java.util.concurrent.locks.*;

public class Main {
    private int count=0;

    private Lock lock=new ReentrantLock();

    public void increment(){
        lock.lock();
        try {
            count++;
        }finally {
            lock.lock();
        }
    }
    public int getCount(){
        lock.lock();
        try {
            return count;
        }finally {
            lock.lock();
        }
    }
    public static void main(String[] args) {
        // Instantiate the Main class
        Main mainObject = new Main();

        // Example usage: increment and get count
        mainObject.increment();
        int currentCount = mainObject.getCount();
        System.out.println("Current count: " + currentCount);
    }
}