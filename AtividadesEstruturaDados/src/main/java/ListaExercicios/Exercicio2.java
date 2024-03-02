package ListaExercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {

        //    Escreva um programa que carregue um vetor inteiro de cem posições com números aleatórios entre 0 e 100. Percorrendo o vetor
        //    criado apenas uma vez, imprima a posição onde ocorre o menor o valor, a soma dos números armazenados e preencha os valores
        //    de um novo vetor com metade do tamanho do vetor original onde a primeira posição do novo vetor é igual à soma da primeira
        //    e da última posição do vetor original. A segunda posição do novo vetor é a soma da segunda e da penúltima posição do vetor
        //    original e assim em diante

        Integer[] vetor1 = new Integer[100];
        Integer[] vetor2 = new Integer[50];
        Random rnd = new Random();
        Integer soma = 0;
        int ordenador = 0;

        System.out.println();
        System.out.print("Vetor 1: \n");
        for (int i = 0; i < 100; i++) {
            int random = rnd.nextInt(100);
            vetor1[i] = random;
            ordenador++;
            if (ordenador < 25) {
                System.out.print(vetor1[i] + ", ");
            } else {
                System.out.print(vetor1[i] + ", ");
                System.out.println();
                ordenador = 0;
            }
        }
        ordenador = 0;
        System.out.println();
        System.out.println();

////        ***Conferencia do vetor ordenado, de forma crescente***
//
//        for (int i = 0; i <100; i++){
//            Arrays.sort(vetor1);
//            System.out.print(vetor1[i] + ", ");
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println();


        for (int i = 0; i < 100; i++) {
            int soma2 = 0;
            Arrays.sort(vetor1);
//            System.out.println("Menor posição: " + vetor1[i]);

            soma2 = soma2 + vetor1[i];
            Arrays.sort(vetor1, Collections.reverseOrder());
//            System.out.println("Maior posição: " + vetor1[i]);

            soma2 = soma2 + vetor1[i];
            if (i < 50) {
                vetor2[i] = soma2;
            }
//            System.out.println("Posição: " + i + ", valor da soma: " + soma2);
//            System.out.println();
        }

        Arrays.sort(vetor1);
        for (int i = 0; i < 100; i++) {
            soma += vetor1[i];
//            System.out.println(vetor1[i]+ " " + soma);
        }

        System.out.println("O menor número do vetor é: " + vetor1[0]);
        System.out.println("A soma dos valores do vetor resulta em: " + soma);
        System.out.println("O Segundo vetor será: ");
        for (int i = 0; i < 50; i++) {
            ordenador++;
            if (ordenador < 25) {
                System.out.print(vetor2[i] + ", ");
            } else {
                System.out.println();
                ordenador = 0;
            }
        }
    }
}
