package ListaExercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        //    3. Escreva um programa que carregue dois vetores inteiros com 5 posições, sendo um com números pares e o outro com números ímpares. O
        //    usuário pode digitar os números em qualquer sequência e o programa deverá armazená-los no vetor correto na ordem em que foram informados
        //    pelo usuário.

        int numPar = 0;
        int numImpar = 0;
        Integer[] vetP = new Integer[5];
        Integer[] vetI = new Integer[5];
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 10 números, 5 pares e 5 ímpares: ");
        for (int i = 0; i < 10; i++) {
            int num = ler.nextInt();
            if (num % 2 == 0) {
                vetP[numPar] = num;
                numPar++;
            } else {
                vetI[numImpar] = num;
                numImpar++;
            }
        }

        System.out.print("Vetor Par: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetP[i] + " ");
        }
        System.out.print("\nVetor Ímpar: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetI[i] + " ");
        }
    }
}
