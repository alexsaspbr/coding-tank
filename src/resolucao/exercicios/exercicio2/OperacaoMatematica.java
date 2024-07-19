package resolucao.exercicios.exercicio2;

public enum OperacaoMatematica {

    ADICAO(Constants.SINAL_ADICAO), SUBTRACAO(Constants.SINAL_SUBTRACAO),
    MULTIPLICACAO(Constants.SINAL_MULTIPLICACAO), DIVISAO(Constants.SINAL_DIVISAO);

    private String sinal;

    OperacaoMatematica(String sinal) {
       this.sinal = sinal;
    }

    public String getSinal() {
        return sinal;
    }

    public static OperacaoMatematica buscarPorSinal(String sinal) {
        for (int i = 0; i < values().length; i++) {
            if(values()[i].getSinal().equalsIgnoreCase(sinal))
                return values()[i];
        }
        return null;
    }

    public double calcular(double numero1, double numero2) {
        double resultado = 0;

        switch (this.sinal) {
            case Constants.SINAL_ADICAO:
                resultado = numero1 + numero2;
                break;
            case Constants.SINAL_SUBTRACAO:
                resultado = numero1 - numero2;
                break;
            case Constants.SINAL_MULTIPLICACAO:
                resultado = numero1 * numero2;
                break;
            case Constants.SINAL_DIVISAO:
                if(numero2 != 0)
                    resultado = numero1 + numero2;
                else
                    System.err.println("Divisao por zero");
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;

    }


    private static class Constants {
        public static final String SINAL_ADICAO = "+";
        public static final String SINAL_SUBTRACAO = "-";
        public static final String SINAL_MULTIPLICACAO = "*";
        public static final String SINAL_DIVISAO = "/";
    }
}
