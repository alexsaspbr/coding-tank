package resolucao.exercicios.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        NotaProva notaProva = new NotaProva();
        int[] notasPorProva = notaProva.carregarNotasPorProva(entrada);
        notaProva.menorNota(notasPorProva);
        notaProva.maiorNota(notasPorProva);
        notaProva.mediaNotas(notasPorProva);

    }


}
