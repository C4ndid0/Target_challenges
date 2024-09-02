import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> fibonacciSequence(int n) {
        List<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(0);
        fibSequence.add(1);

        int nextFib = 1;
        while (nextFib < n) {
            nextFib = fibSequence.get(fibSequence.size() - 1) + fibSequence.get(fibSequence.size() - 2);
            fibSequence.add(nextFib);
        }

        return fibSequence;
    }

    // Método que verifica se o número pertence à sequência de Fibonacci
    public static String isInFibonacci(int n) {
        if (n < 0) {
            return "O número não pode ser negativo.";
        }

        List<Integer> fibSequence = fibonacciSequence(n);

        if (fibSequence.contains(n)) {
            return "O número " + n + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + n + " NÃO pertence à sequência de Fibonacci.";
        }
    }

}
