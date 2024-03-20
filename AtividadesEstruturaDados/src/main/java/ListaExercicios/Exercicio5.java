package ListaExercicios;

import java.util.Arrays;
import java.util.Random;

public class Exercicio5 {

//        5. Implemente dois algoritmos que ordenem os elementos de um vetor em ordem crescente e compare o número de trocas que eles efetuam
//        durante a ordenação de:
//        a) um vetor criado com os números de 1 até 100 aleatoriamente distribuídos.
//        b) um vetor criado com os números de 1 até 100 ordenados em ordem decrescente.

    //5.1


    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Array ordenado usando Bubble Sort:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int contador1 = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    contador1++;
                }
            }
        }
        main(contador1);
    }

    public Exercicio5() {

    }




//        int[] numeros = new int[10];
//        random(numeros);
//
//        System.out.print("Array antes da ordenação: ");
//        imprimirArray(numeros);
//        ordenacaoPorInsercao(numeros);
//        System.out.print("Array após a ordenação: ");
//        imprimirArray(numeros);
//    }
//
//    public static void ordenacaoPorInsercao(int[] array) {
//        int n = array.length;
//        int trocas = 0;
//        for (int i = 1; i < n; ++i) {
//            int chave = array[i];
//            int j = i - 1;
//            trocas++;
//
//            while (j >= 0 && array[j] > chave) {
//                array[j + 1] = array[j];
//                j = j - 1;
//            }
//
//            array[j + 1] = chave;
//        }
//        System.out.println("Total de trocas: " + trocas);
//    }
//
//    public static void imprimirArray(int[] array) {
//        for (int i = 0; i < array.length; ++i) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void random(int[] array) {
//        for (int i = 0; i < 10; i++) {
//            Random rnd = new Random();
//            int random = rnd.nextInt(100);
//            array[i] = random;
//        }
//    }

    //        ***** Duvida // Incompleto *****
}
