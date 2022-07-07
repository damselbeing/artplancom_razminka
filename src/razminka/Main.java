package razminka;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static String line = scanner.nextLine();

    public static void main(String[] args) {
        System.out.print(line + " ");
        System.out.print(printReverseLine(line) + " ");
        System.out.print(checkMethodTiming(1000) + " ");
        System.out.print(checkMethodTiming(10000) + " ");
        System.out.print(checkMethodTiming(100000) + " ");
    }

    public static String printReverseLine(String line) {
        StringBuilder reverseLine = new StringBuilder(line);
        return reverseLine.reverse().toString();
    }

    public static long checkMethodTiming(int repeatNumber) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < repeatNumber; i++) {
            printReverseLine(line);
        }
        return System.currentTimeMillis() - startTime;
    }
}
