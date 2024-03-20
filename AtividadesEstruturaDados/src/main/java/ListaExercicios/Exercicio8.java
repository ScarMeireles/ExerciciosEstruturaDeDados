package ListaExercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
//        Crie uma matriz bidimensional quadrada para armazenar 9 valores inteiros
//        informados pelo usuário. Depois, calcule e mostre na tela o determinante da
//        matriz.

        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int total = 0;


        System.out.println("Digite 9 números que serão armazenados em uma matriz.");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = ler.nextInt();
                matriz[i][j] = num;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int k = (i + j) % 3;
                total += k;
            }
        }
        System.out.println("Total: " + total);

    }
}
