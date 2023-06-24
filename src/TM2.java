import java.util.ArrayList;
import java.util.List;

public class TM2 {

    public static List<Integer> generateFibonacci(int n) {
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);

        while (fibonacciList.get(fibonacciList.size() - 1) < n) {
            int nextFibonacci = fibonacciList.get(fibonacciList.size() - 1) + fibonacciList.get(fibonacciList.size() - 2);
            fibonacciList.add(nextFibonacci);
        }

        return fibonacciList.subList(0, fibonacciList.size() - 1);
    }

    public static int sumEvenFibonacci(List<Integer> numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                totalSum += num;
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int limit = 4500;

        List<Integer> fibonacciNumbers = generateFibonacci(limit);

        int sumOfEvenFibonacci = sumEvenFibonacci(fibonacciNumbers);

        System.out.println("Deret bilangan Fibonacci genap:");
        for (int num : fibonacciNumbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nTotal bilangan Fibonacci genap: " + fibonacciNumbers.size());
        System.out.println("Jumlah dari bilangan Fibonacci genap: " + sumOfEvenFibonacci);
    }
}
