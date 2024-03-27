package ListaExercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
//        4. Escreva um programa que ordene um vetor de tamanho arbitrário preenchido com números aleatórios e execute a pesquisa por um valor
//        passado como parâmetro utilizando o algoritmo da busca binária.


        int[] vet = new int[10];
        Random rnd = new Random();
        Scanner ler = new Scanner(System.in);

        int a = 0;
        int c = 9;


//        System.out.println("Digite 10 valores para um vetor");

        for (int i = 0; i < 10; i++) {
//            int num = ler.nextInt();
//            vet[i] = num;
            int random = rnd.nextInt(100);
            vet[i] = random;
        }

        System.out.print("Números armazenados no vetor: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vet[i] + " ");
        }
        Arrays.sort(vet);


        System.out.print("\nNúmeros armazenados no vetor ordenado: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vet[i] + " ");
        }

        System.out.println("\nDigite um número à ser buscado na lista: ");
        int num = ler.nextInt();

        for (int i = 0; i < 10; i++) {
            int b = (a + c) / 2;
//            System.out.println("b: " + b);
            if (vet[b] == num) {
                System.out.println("O número escolhido está no índice: " + b);
                return;
            } else if (vet[b] > num) {
                c = b - 1;
            } else if (vet[b] < num) {
                a = b + 1;
            }
        }
    }
}
