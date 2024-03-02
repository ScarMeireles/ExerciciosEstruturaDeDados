package ListaExercicios;

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
//        Escreva um programa que crie um vetor de números inteiros, receba 10 valores
//        informados pelo usuário, imprima todos os valores pares e depois todos os
//        valores ímpares.

        int[] vet = new int[10];
        int[] numPar = new int[10];
        int[] numImpar = new int[10];
        Scanner ler = new Scanner(System.in);


        System.out.println("Digite 10 números: ");
        for (int i = 0; i < 10; i++) {
            int num = ler.nextInt();
            vet[i] = num;
        }
        for (int i = 0; i < 10; i++) {
            if (vet[i] % 2 == 0) {
                numPar[i] = vet[i];
            } else {
                numImpar[i] = vet[i];
            }
        }
        System.out.print("Números pares: ");
        for (int i = 0; i < 10; i++) {
            if (numPar[i] != 0) {
                System.out.print(numPar[i] + " ");
            }
        }

        System.out.print("\nNúmeros ímpares: ");
        for (int i = 0; i < 10; i++) {
            if (numImpar[i] != 0) {
                System.out.print(numImpar[i] + " ");
            }
        }
    }
}
