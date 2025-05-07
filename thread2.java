import java.util.Scanner;

class FibonacciGenerator extends Thread {
    private int terms;

    public FibonacciGenerator(int terms) {
        this.terms = terms;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + "\t");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("\nExiting from Thread FibonacciGenerator...");
    }
}

class EvenNumberPrinter extends Thread {
    private int start;
    private int end;

    public EvenNumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("Even numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println("\nExiting from Thread EvenNumberPrinter...");
    }
}

class thread2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms for Fibonacci: ");
        int fibTerms = scanner.nextInt();

        System.out.print("Enter start of range for even numbers: ");
        int rangeStart = scanner.nextInt();

        System.out.print("Enter end of range for even numbers: ");
        int rangeEnd = scanner.nextInt();
        FibonacciGenerator fibThread = new FibonacciGenerator(fibTerms);
        EvenNumberPrinter evenThread = new EvenNumberPrinter(rangeStart, rangeEnd);
        fibThread.start();
        evenThread.start();

        scanner.close();
    }
}

