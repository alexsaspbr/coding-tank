import java.util.Scanner;

public class MaiorNumero {

    public static void maiorNumero() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o segundo numero");
        int num2 = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o terceiro numero");
        int num3 = Integer.parseInt(entrada.nextLine());

        int maior = num1;

        maior = (num2 > maior) ? num2 : maior;
        maior = (num3 > maior) ? num3 : maior;

        //int maior = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.printf("O maior numero é %d", maior);

    }

}
