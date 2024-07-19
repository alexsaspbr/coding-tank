public enum OperacaoMatematica {

    ADICAO("+"), SUBTRACAO("-"),
    MULTIPLICACAO("*"), DIVISAO("/");

    private String sinal;

    OperacaoMatematica(String sinal) {
       this.sinal = sinal;
    }

    public double calcular(double numero1, double numero2) {
        double resultado;

        switch (this.sinal) {
            case "+":
                resultado = numero1 + numero2;
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;

    }


}
