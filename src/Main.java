import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static void exemplo2() {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int maiorNumero = n1 > n2 ? n1 : n2;

        System.out.println(maiorNumero);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean trocou;
        int qtddComparacoes = 0;
        int qtddTrocas= 0;

        // Repetir até que nenhuma troca seja necessária
        do {
            trocou = false;

            for (int i = 0; i < n - 1; i++) {
                qtddComparacoes++;
                if (array[i] > array[i + 1]) {
                    qtddTrocas++;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    // Marca que ocorreu uma troca
                    trocou = true;
                }
            }

        } while (trocou);

        System.out.println("Quantidade de comparações: " + qtddComparacoes);
        System.out.println("Quantidade de trocas: " + qtddTrocas);

    }

    public static void s1Exercicio1() {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        int z = 0;
        while (z < arraySize) {
            int numero = scanner.nextInt();
            array[z] = numero;
            z++;
        }

        for(int j = 1; j < arraySize; j++) {
            int ch = array[j];
            int i = j - 1;
            while(i >= 0 && array[i] > ch) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i+1] = ch;
        }

        StringBuilder arrayString = new StringBuilder();

        for(int k = 0; k < arraySize; k++) {
            arrayString.append(array[k]).append(" ");
        }

        System.out.println(arrayString);
    }

    public static void s1Exercicio2(){}
}