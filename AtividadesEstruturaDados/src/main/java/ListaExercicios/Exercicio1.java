package ListaExercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

//        Escreva um programa que leia dois vetores inteiros com dez posições cada. A partir desses vetores, carregue um terceiro vetor onde
//        o valor de cada elemento será a média dos elementos de mesmo índice nos dois vetores anteriores.

        Scanner ler = new Scanner(System.in);
        double[] vet1 = new double[10];
        double[] vet2 = new double[10];
        double[] vet3 = new double[10];

        System.out.println("Digite 10 números para o vetor 1: ");
        for (int i = 0; i < 10; i++) {
            vet1[i] = ler.nextInt();
        }
        System.out.println("Digite 10 números para o vetor 2: ");
        for (int i = 0; i < 10; i++) {
            vet2[i] = ler.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            vet3[i] = (vet1[i] + vet2[i]) / 2;
        }

//        System.out.print("Vet1 = ");
//        for (int i = 0; i < 10; i++){
//            System.out.print(vet1[i] + ", ");
//        }
//
//        System.out.println("");
//            System.out.print("Vet2 = ");
//        for (int i = 0; i < 10; i++) {
//            System.out.print(vet2[i] + ", ");
//        }

        System.out.println(" ");
        System.out.print("Vetor 3 = ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vet3[i] + ", ");
        }
    }
}