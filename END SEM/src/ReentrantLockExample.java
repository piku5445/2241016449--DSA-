
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private ReentrantLock lock = new ReentrantLock();
    private int counter = 0;

    public void incrementCounter() {
        lock.lock();
        try {
            // Critical section starts
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
            // Simulating some processing time
            Thread.sleep(100);
            // Critical section ends
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class WorkerThread extends Thread {
    private SharedResource sharedResource;

    public WorkerThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.incrementCounter();
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new WorkerThread(sharedResource);
        Thread thread2 = new WorkerThread(sharedResource);
        Thread thread3 = new WorkerThread(sharedResource);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
