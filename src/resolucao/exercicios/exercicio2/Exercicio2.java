package resolucao.exercicios.exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int controlador = 0;

        do {
            String operacao = solicitarDados(input, "Digite a operacao (+, -, *, /)");
            String primeiroNumero = solicitarDados(input, "Digite o primeiro numero");
            String segundoNumero = solicitarDados(input, "Digite o segundo numero");
            double num1 = Double.parseDouble(primeiroNumero);
            double num2 = Double.parseDouble(segundoNumero);

            System.out.println(OperacaoMatematica.buscarPorSinal(operacao).calcular(num1, num2));

            controlador = Integer.parseInt(solicitarDados(input, "Digite 0 - para sair, 1 - para continuar"));

        } while(controlador == 1);
    }

    public static String solicitarDados(Scanner input, String dadoSolicitado) {
        System.out.println(dadoSolicitado);
        return input.nextLine();
    }

}
