import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número a ser verificado: ");
        int numero = scanner.nextInt();
        scanner.close();

        // Chama a função e imprime o resultado
        String resultado = Fibonacci.isInFibonacci(numero);
        System.out.println(resultado);
    }
}