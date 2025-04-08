import java.util.Scanner;

public class DesafioDoisDio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo do cliente:");
        double saldo = scanner.nextDouble();

        // Implemente a classificação do cliente com base no saldo
        String classificacao;

        if (saldo < 0) {
            classificacao = "Negativado";
        } else if (saldo >= 0 && saldo <= 500) {
            classificacao = "Baixo";
        } else {
            classificacao = "Confortavel";
        }

        // Exibe a classificação
        System.out.println("Classificação do cliente: " + classificacao);

        scanner.close();
    }
}