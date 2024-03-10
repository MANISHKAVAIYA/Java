public class Main {
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }

    public static void main(String[] args) {
        Main sharedResource = new Main();

        // Example of using the shared resource
        sharedResource.increment();
        int currentCount = sharedResource.getCount();
        System.out.println("Current count: " + currentCount);
    }
}
