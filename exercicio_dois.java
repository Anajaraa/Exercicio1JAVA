//2. Escreva um programa que calcula a média de uma lista de números fornecida pelo usuário.

import java.util.Scanner;

public class exercicio_dois {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de valores a serem inseridos:");
        int n = sc.nextInt();
        int[] valores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            valores[i] = sc.nextInt();
        }
        double media = 0;
        for (int i = 0; i < n; i++) {
            media += valores[i];
        }
        media /= n;
        System.out.println("A média é: " + media);
    }
}
