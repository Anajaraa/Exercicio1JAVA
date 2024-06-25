//9. Escreva um programa que verifica se uma string é um palíndromo.


import java.util.Scanner;

public class Exercicio_Nove {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String s = sc.nextLine();
        int tam = s.length();
        for (int i = 0; i < tam; i++) {
            for (int j = tam - 1; j > i; j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    System.out.println("Não é palíndromo");
                    System.exit(0);
                }
            }
        }
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}