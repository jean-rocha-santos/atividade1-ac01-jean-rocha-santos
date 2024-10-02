package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4DesafioNumeros {

    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();
        List<Integer> listaPares = new ArrayList<>();
        List<Integer> listaImpares = new ArrayList<>();
        Integer menorNumero = 0;
        Integer maiorNumero = 0;
        Integer somaNumeros = 0;
        Boolean digito0 = false;
        Boolean textoPares = false;
        Boolean textoImpares = false;


        while (digito0 == false) {
            System.out.println("Digite números inteiros: ");
            Integer numeroInteiros = leitorNumero.nextInt();
            if (numeroInteiros == 0) {
                digito0 = true;
            } else {
                listaNumeros.add(numeroInteiros);
                menorNumero = numeroInteiros;
            }
        }
        for (var i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) % 2 == 0) {
                if (textoPares == false) {
                    listaPares.add(listaNumeros.get(i));
                    /*System.out.print(String.format("\nPares: %d", listaNumeros.get(i)));*/

                } else if (textoPares == true) {
                    listaPares.add(listaNumeros.get(i));
                    /* System.out.print(", " + listaNumeros.get(i));*/
                }
                textoPares = true;
            } else if (listaNumeros.get(i) % 2 != 0) {
                if (textoImpares == false) {
                    listaImpares.add(listaNumeros.get(i));
                    /*System.out.print(String.format("\nÍmpares: %d", listaNumeros.get(i)));*/

                } else if (textoImpares == true) {
                    /*System.out.print(", " + listaNumeros.get(i));*/
                    listaImpares.add(listaNumeros.get(i));
                }

            }
            textoImpares = true;
            somaNumeros += listaNumeros.get(i);
            if (listaNumeros.get(i) > maiorNumero) {
                maiorNumero = listaNumeros.get(i);
            }
            if (menorNumero > listaNumeros.get(i)) {
                menorNumero = listaNumeros.get(i);
            }


        }


        System.out.println("Pares: " + listaPares);
        System.out.println("Impares" + listaImpares);
        System.out.println("Soma: " + somaNumeros);
        System.out.println("Menor número: " + menorNumero);
        System.out.println("Maior número: " + maiorNumero);

    }
}