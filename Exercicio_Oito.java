//8. Escreva um programa que converte um número decimal em binário.


import java.util.Scanner;

public class Exercicio_Oito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número decimal: ");
        int num = sc.nextInt();
        int bin = 0;
        while (num > 0) {
            bin = bin * 10 + num % 2;
            num = num / 2;
        }
        System.out.println("O número binário é: " + bin);
    }
}