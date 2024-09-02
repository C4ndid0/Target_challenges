import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a entrada da string pelo usuário
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        // Chama o método que conta a letra 'a'
        contarLetraA(inputString);
    }

    public static void contarLetraA(String str) {
        int count = 0;
        // Converte a string para minúsculas e conta quantas vezes 'a' aparece
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        // Verifica se a letra 'a' está presente e exibe o resultado
        if (count > 0) {
            System.out.println("A letra 'a' ocorre " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }
    }
}
