package school.sptech;

import java.util.Scanner;

public class Ex2Tabuada {

    public static void main(String[] args) {

        Scanner leitorNumero = new Scanner(System.in);
        System.out.println("1 - Soma\n" +
                "2 - Multiplicação\n" +
                "3 - Divisão\n" +
                "4 - Subtração\n" +
                "5 - Potenciação\n" +
                "6 - Resto da divisão");

        System.out.println("\nDigite o número correspondente a operação desejada:");

        Integer operacaoEscolhida = leitorNumero.nextInt();
        System.out.println("Digite um número inteiro");
        Integer numeroDigitado = leitorNumero.nextInt();
        Integer resultado = 0;
        Double resultadoQuebrado=0.0;
        for (var i = 1; i < 11; i++) {

            if (operacaoEscolhida == 1) {
                resultado = numeroDigitado + i;
                System.out.print(String.format("""
                                 %d + %d = %d
                        """, numeroDigitado, i, resultado));

            } else if (operacaoEscolhida == 2) {
                resultado = numeroDigitado * i;
                System.out.print(String.format("""
                                 %d * %d = %d
                        """, numeroDigitado, i, resultado));
            }
            else if (operacaoEscolhida == 3) {
                resultadoQuebrado =numeroDigitado.doubleValue() / i;
                System.out.print(String.format("""
                                 %d / %d = %.2f
                        """, numeroDigitado, i, resultadoQuebrado));
            }
            else if (operacaoEscolhida == 4) {
                resultado = numeroDigitado - i;
                System.out.print(String.format("""
                                 %d - %d = %d
                        """, numeroDigitado, i, resultado));
            }
            else if (operacaoEscolhida == 5) {
                resultadoQuebrado = Math.pow(numeroDigitado,i);
                System.out.print(String.format("""
                                 %d ^ %d = %.0f
                        """, numeroDigitado, i, resultadoQuebrado));
            }
            else {
                resultado =  numeroDigitado % i;
                System.out.println(numeroDigitado + " % " + i + " = "+ resultado);
            }
        }


    }
}
