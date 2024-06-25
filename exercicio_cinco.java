//5. Escreva um programa que verifica se um número fornecido pelo usuário é primo.


import java.util.Scanner;

public class exercicio_cinco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        if (numero == 1) {
            System.out.println("Número é primo.");
        } else if (numero % 2 == 0) {
            System.out.println("Número é não primo.");
        } else {
            for (int i = 3; i <= numero / 2; i += 2) {
                if (numero % i == 0) {
                    System.out.println("Número é não primo.");
                    break;
                }
            }
        }
    }
}
