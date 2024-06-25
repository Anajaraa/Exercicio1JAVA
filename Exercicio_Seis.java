//6. Escreva um programa que encontra o maior número em uma lista de números fornecida pelo usuário.


import java.util.Scanner;

public class Exercicio_Seis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int maior = numero;
        System.out.println("Digite outro número: ");
        int outro = sc.nextInt();
        if (numero < outro) {
            maior = outro;
        }
        System.out.println("O maior número é: " + maior);
    }
}
