import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = solicitarDados(input, "Nome:");
        String dataNascimento = solicitarDados(input, "Data de nascimento:");
        String endereco = solicitarDados(input, "Endereço (logradouro, número, bairro, cidade, estado):");
        String complemento = solicitarDados(input, "Complemento:");
        String profissao = solicitarDados(input, "Profissão:");
        String email = solicitarDados(input, "E-mail:");
        String telefone = solicitarDados(input, "Telefone:");

        imprimirDados(nome, dataNascimento, endereco,
                complemento, profissao, email,telefone);

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