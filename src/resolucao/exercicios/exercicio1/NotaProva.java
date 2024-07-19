package resolucao.exercicios.exercicio1;

import java.util.Scanner;

public class NotaProva {

    public int[] carregarNotasPorProva(Scanner entrada) {
        int quantidadeProvas = Integer.parseInt(solicitarDados(entrada, "Informe a quantidade de provas:"));
        int [] notasPorProva = new int[quantidadeProvas];
        for (int i = 0; i < notasPorProva.length; i++) {
            notasPorProva[i] = Integer.parseInt(solicitarDados(entrada, "Informe a nota da prova " + (i + 1) + " do aluno (de 0-100)"));
        }
        return notasPorProva;
    }

    public void menorNota(int [] notasPorProva) {
        int menor  = notasPorProva[0];
        for (int i = 1; i < notasPorProva.length; i++) {
            if(menor > notasPorProva[i]) {
                menor = notasPorProva[i];
            }
        }
        imprimir("A menor nota é: " + menor);
    }

    public void maiorNota(int [] notasPorProva) {
        int maior  = notasPorProva[0];
        for (int i = 1; i < notasPorProva.length; i++) {
            if(maior < notasPorProva[i]) {
                maior = notasPorProva[i];
            }
        }
        imprimir("A maior nota é: " + maior);
    }

    public void mediaNotas(int [] notasPorProva) {
        double media  = 0;
        double somatoria = 0;
        for (int i = 0; i < notasPorProva.length; i++) {
            somatoria = somatoria + notasPorProva[i];
        }
        media = somatoria / notasPorProva.length;
        imprimir("A média das notas é: " + media);
    }


    private String solicitarDados(Scanner entrada, String dadoSolicitado) {
        System.out.println(dadoSolicitado);
        return entrada.nextLine();
    }

    private void imprimir(String mensagem) {
        System.out.println(mensagem);
    }

}
