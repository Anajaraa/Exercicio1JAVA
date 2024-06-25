//10. Escreva um programa que calcula o fatorial de um número fornecido pelo usuário.


import java.util.Scanner;

public class Exercicio_Dez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int fat = 1;
        for (int i = 1; i <= num; i++) {
            fat = fat * i;
        }
        System.out.println("O fatorial de " + num + " é: " + fat);
    }
}
