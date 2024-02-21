public class GerarTabuada {
    // Gera e exibe a tabuada do número enviado pelo usuário
    public void exibirTabuada(int number){
        if (number < 0) {
            System.out.println("Por favor, insira um número positivo.");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
