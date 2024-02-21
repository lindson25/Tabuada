import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GerarTabuada gerar = new GerarTabuada();
        System.out.println("Bem-vindo à calculadora de tabuada!");

        try {
            System.out.println("Digite um número inteiro para gerar uma tabuada: ");
            int number = scan.nextInt(); // Solicita ao usuário um número inteiro para gerar a tabuada
            
            // Verifica se o número inserido é diferente de zero antes de gerar a tabuada
            if (number == 0) {
                System.out.println("Digite um número válido diferente de zero.");
            } else {
                gerar.exibirTabuada(number);
                System.out.println("Agradecemos por usar a calculadora de tabuada!");
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("[ERRO] Digite um número válido!");
            e.printStackTrace(); // Adiciona informações detalhadas sobre a exceção
        }
        scan.close();
    }
}
