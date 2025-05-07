import java.util.Scanner;

class Multiplication extends Thread {
    @Override
    public void run() {
        System.out.println("Multiplication table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X 5 = " + (i * 5));
        }
        System.out.println("Exiting from Thread Multiplication...");
    }
}

class PrimeNumbers extends Thread {
    private int n;

    public PrimeNumbers(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        printPrimes(n);
    }

    static void printPrimes(int N) {
        int x, y, flag;
        System.out.println("All the Prime numbers between 1 and " + N + " are:");
        for (x = 2; x <= N; x++) {
            flag = 1;
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(x + "\t");
            }
        }
        System.out.println();
    }
}

class thread{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n for Prime numbers: ");
        int n = scanner.nextInt();

        Multiplication multiplicationThread = new Multiplication();
        PrimeNumbers primeNumbersThread = new PrimeNumbers(n);

        primeNumbersThread.start();
        multiplicationThread.start();

        scanner.close();
    }
}

