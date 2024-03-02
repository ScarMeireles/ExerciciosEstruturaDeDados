package ListaExercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        double soma = 0;
        double pesoTotal = 0;

        for (int i = 0; i < 10; i++) {
            soma += vetor[i] * i;
            pesoTotal += i;
        }

        double mediaPonderada = soma / pesoTotal;

        System.out.println("Média dos valores armazenados no vetor ponderados pelos índices: " + mediaPonderada);
    }
}