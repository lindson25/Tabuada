import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para gerar uma tabuada: ");
        String number_old = scan.nextLine(); // Solicita ao usuário um número.
        int new_number = Integer.parseInt(number_old); // Converte o dado de string para inteiro

        //Gera a tabuada do número enviado pelo usuário 
        for (int i = 1; i <= 10; i++) {
            System.out.println(new_number + " * " + i + " = " + new_number * i);
        }
        scan.close();
    }
}
