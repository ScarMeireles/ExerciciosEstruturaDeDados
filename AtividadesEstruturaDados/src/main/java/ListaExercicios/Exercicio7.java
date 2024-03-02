package ListaExercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
//        Escreva um programa que leia 10 valores inteiros, informados pelo usuário e
//        armazene-os em um vetor. Após isso, lendo o vetor uma única vez e sem criar
//        outros vetores, mostre na tela a média dos valores armazenados no vetor
//        ponderados pelos índices nos quais estão armazenados.

        Scanner ler = new Scanner(System.in);
        int[] vet = new int[10];
        double media = 0;
        double pesoTotal = 0;

        System.out.println("Digite 10 números: ");
        for (int i = 0; i < 10; i++) {
            int valor = ler.nextInt();
            vet[i] = valor;
            media += vet[i] * i;
            pesoTotal += i;
        }

        double mediaPonderada = media / pesoTotal;

        System.out.printf("Média dos valores do vetor: %.2f", mediaPonderada);

    }
}
