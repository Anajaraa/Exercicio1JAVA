//7. Escreva um programa que conta o número de vogais em uma frase fornecida pelo usuário.

import java.util.Scanner;

public class Exercicio_Sete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        int vogais = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'á' || letra == 'â' || letra == 'ã' || letra == 'à' ||
                    letra == 'e' || letra == 'é' || letra == 'ê' || letra == 'è' ||
                    letra == 'i' || letra == 'í' || letra == 'î' || letra == 'ì' ||
                    letra == 'o' || letra == 'ó' || letra == 'ô' || letra == 'õ' || letra == 'ò' ||
                    letra == 'u' || letra == 'ú' || letra == 'û' || letra == 'ù') {
                vogais++;
            }
        }
        double porcentagem = (double) vogais / frase.length();
        System.out.println("Vogais: " + vogais);
        System.out.println("Porcentagem de vogais: " + porcentagem);
    }
}
