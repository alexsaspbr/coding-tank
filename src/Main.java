import resolucao.exercicios.exercicio2.OperacaoMatematica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*String nome = solicitarDados(input, "Nome:");
        String dataNascimento = solicitarDados(input, "Data de nascimento:");
        String endereco = solicitarDados(input, "Endereço (logradouro, número, bairro, cidade, estado):");
        String complemento = solicitarDados(input, "Complemento:");
        String profissao = solicitarDados(input, "Profissão:");
        String email = solicitarDados(input, "E-mail:");
        String telefone = solicitarDados(input, "Telefone:");

        imprimirDados(nome, dataNascimento, endereco,
                complemento, profissao, email,telefone);
*/


/*      int [] numeros = {1, 2, 3, 4, 5};
        int [] numeros2 = new int[2];
        numeros2[0] = 20;
        numeros2[1] = 87;
        lerArrayComWhile(numeros);
        lerArrayComFor(numeros2);

        double pi = 3.14187987897;
        System.out.printf("O numero PI é %.2f", pi);*/


    }

    public static   void lerArrayComFor(int [] numeros) {

        for(int contador = 0; contador < numeros.length; contador++) {
            System.out.printf("Numero da posicao %d é %d \n", contador, numeros[contador]);
        }

    }

    public static   void lerArrayComWhile(int [] numeros) {
        int tamanho = numeros.length;
        int contador = 0;

        while(contador < tamanho) {
            System.out.printf("Numero da posicao %d é %d \n", contador, numeros[contador]);
            contador++;
        }

    }

    public static String solicitarDados(Scanner input, String dadoSolicitado) {
        System.out.println(dadoSolicitado);
        return input.nextLine();
    }

    public static void imprimirDados(String nome, String dataNascimento,
                              String endereco,  String complemento,
                              String profissao, String email, String telefone) {
        System.out.println("Pessoa { "
                + "nome = "+ nome
                + "Data de nascimento: = "+ dataNascimento
                + "Endereço = "+ endereco
                + "Complemento = "+ complemento
                + "Profissão = "+ profissao
                + "E-mail = "+ email
                + "Telefone = "+ telefone
                +" }");
    }


}