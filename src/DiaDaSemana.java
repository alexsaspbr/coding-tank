public enum DiaDaSemana {

    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO;

    public static void finalDeSemana(){

        DiaDaSemana[] todosDias = DiaDaSemana.values();

        for(int contador = 0; contador < todosDias.length; contador++) {
            DiaDaSemana diaDaSemana = todosDias[contador];

            if(DiaDaSemana.DOMINGO.equals(diaDaSemana)
               || DiaDaSemana.SABADO.equals(diaDaSemana)) {
                System.out.printf("Ordinal %d e Nominal %s",
                        diaDaSemana.ordinal(), diaDaSemana.name());
                System.out.println();
            }

        }

    }

    public static void diasUteis(){

        DiaDaSemana[] todosDias = DiaDaSemana.values();

        for(int contador = 0; contador < todosDias.length; contador++) {
            DiaDaSemana diaDaSemana = todosDias[contador];

            if(!DiaDaSemana.DOMINGO.equals(diaDaSemana)
                    && !DiaDaSemana.SABADO.equals(diaDaSemana)) {
                System.out.printf("Ordinal %d e Nominal %s",
                        diaDaSemana.ordinal(), diaDaSemana.name());
                System.out.println();
            }

        }

    }

    public static void todosDias(){

        DiaDaSemana[] todosDias = DiaDaSemana.values();

        for(int contador = 0; contador < todosDias.length; contador++) {
            DiaDaSemana diaDaSemana = todosDias[contador];
            System.out.printf("Ordinal %d e Nominal %s",
                    diaDaSemana.ordinal(), diaDaSemana.name());
            System.out.println();
        }

    }

}
