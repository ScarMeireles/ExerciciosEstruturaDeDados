package ListaExercicios;

import java.util.Random;

public class Exercicio5 {

//        5. Implemente dois algoritmos que ordenem os elementos de um vetor em ordem crescente e compare o número de trocas que eles efetuam
//        durante a ordenação de:
//        a) um vetor criado com os números de 1 até 100 aleatoriamente distribuídos.
//        b) um vetor criado com os números de 1 até 100 ordenados em ordem decrescente.

    //5.1

    public static int bubbleSort(int[] arr1) {
        int n = arr1.length;
        int contador = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                    contador++;
                }
            }
        }
        return contador;
    }

    public static int InsertionSort(int[] arr2) {
        int n = arr2.length;
        int contador = 0;
        for (int i = 1; i < n; ++i) {
            int chave = arr2[i];
            int j = i - 1;

            while (j >= 0 && arr2[j] > chave) {
                arr2[j + 1] = arr2[j];
                j = j - 1;
                contador++;
            }
            arr2[j + 1] = chave;
        }
        return contador;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int random = rnd.nextInt(100);
            arr1[i] = random;
            arr2[i] = random;
        }


        System.out.println("Array 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nArray 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println(" ");

        bubbleSort(arr1);
        System.out.println("\nArray ordenado usando Bubble Sort:");

        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println("\nNúmero de trocas usando Bubble Sort: " + bubbleSort(arr1));

        InsertionSort(arr2);
        System.out.println("\nArray ordenado usando Insertion Sort:");

        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println("\nNúmero de trocas usando Insertion Sort: " + InsertionSort(arr2));
    }

}
