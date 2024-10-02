package school.sptech;

import java.util.Scanner;

public class Ex1CalculadoraMedia {

    public static void main(String[] args) {

        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        Double nota1 = leitorNumero.nextDouble();
        System.out.println("Digite a segunda nota:");
        Double nota2 = leitorNumero.nextDouble();
        Double media = (nota1 * 0.4 + nota2 * 0.6);

        System.out.println(String.format("""
                Média: %.1f
                """, media));

    }
}
