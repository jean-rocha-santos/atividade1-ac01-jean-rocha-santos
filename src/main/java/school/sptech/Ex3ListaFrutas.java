package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3ListaFrutas {

    public static void main(String[] args) {

        List<String> listaFrutas = new ArrayList<>();
        Scanner leitorTexto = new Scanner(System.in);

        Boolean digito = false;
        Boolean encontrou= false;
        String frutaDigitada;
        String frutaPesquisa;
        Integer frutaNumero;


        for (var i = 1; digito == false; i++) {
            System.out.println("Digite o nome da fruta " + i);
            frutaDigitada = leitorTexto.next().toLowerCase();
            /*frutaNumero = frutaDigitada=="0" ? Integer.parseInt(frutaDigitada) : 1 ;*/
            frutaNumero = "0".equals(frutaDigitada) ? Integer.parseInt(frutaDigitada) : 1;

            if (frutaNumero != 0) {

                listaFrutas.add(frutaDigitada);
            } else {
                digito = true;
            }
        }
        System.out.println("Digite o nome de uma fruta para pesquisa");

        frutaPesquisa = leitorTexto.next().toLowerCase();

        for (var i = 0; i < listaFrutas.size(); i++) {
            if (listaFrutas.get(i).equalsIgnoreCase(frutaPesquisa)) {
                System.out.println(String.format("""
                        A fruta %S existe na lista
                        """, listaFrutas.get(i)));
                        encontrou=true;
                break;
            }

            }
            if (encontrou==false) {
            System.out.println(String.format("""
                        Não existe a fruta %s na lista.
                        """, frutaPesquisa));
        }

    }
}
