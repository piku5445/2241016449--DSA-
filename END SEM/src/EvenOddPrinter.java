
class Printer {
    private boolean isOdd = true;

    synchronized void printEven(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(number);
        isOdd = true;
        notify();
    }

    synchronized void printOdd(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(number);
        isOdd = false;
        notify();
    }
}

class EvenThread extends Thread {
    private final Printer printer;
    private final int max;

    EvenThread(Printer printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 2; i <= max; i += 2) {
            printer.printEven(i);
        }
    }
}

class OddThread extends Thread {
    private final Printer printer;
    private final int max;

    OddThread(Printer printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 1; i <= max; i += 2) {
            printer.printOdd(i);
        }
    }
}

public class EvenOddPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();
        int max = 10; // The maximum number to print

        Thread oddThread = new OddThread(printer, max);
        Thread evenThread = new EvenThread(printer, max);

        oddThread.start();
        evenThread.start();
    }
}
