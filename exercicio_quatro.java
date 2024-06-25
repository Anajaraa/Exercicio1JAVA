//4. Escreva um programa que imprime os fatores de um número fornecido pelo usuário.


import java.util.Scanner;

public class exercicio_quatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}
