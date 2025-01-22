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

    //Algoritmo Insertion Sort: O(n²)
    public static void insertionSort() {
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

    public static int findMax(int[] array, int indiceUltimoNumero) {
        //O(n)
        if (indiceUltimoNumero == 0) {
            return array[0];
        }

        int maior = findMax(array, indiceUltimoNumero - 1);

        if(array[indiceUltimoNumero] > maior) {
            return array[indiceUltimoNumero];
        } else {
            return maior;
        }
    }

    private static void s1Exercicio2() {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        int z = 0;
        while (z < arraySize) {
            int numero = scanner.nextInt();
            array[z] = numero;
            z++;
        }

        System.out.println(findMax(array, arraySize - 1));
    }

    private static void s1Exercicio3() {
        //O(n)
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int s = 0;

        for(int i = 1; i < n - 2; i++) {
//            for(int j = i; j < n; j++) {
//                s++;
//            }

            s = s + (n - i);
        }

        System.out.println(s);
    }

    //Busca sequencial: O(n)
    public static int buscaSequencial(int x, int[] v) {
        int j = 0;
        int r = v.length - 1;

        int resultado = 0;
        while(j <= r && v[j] < x) {
            if(j <= r && v[j] == x) {
                j++;
                resultado = j;
            } else {
                j++;
                resultado = -1;
            }
        }
        return resultado;
    }

    //Buscar binaria: O(lg n)
    public static int buscaBinaria(int x, int[] v) {
        int p = 0;
        int r = v.length - 1;

        while (p <= r) {
            int m = (p + r)/2;

            if(x == v[m]) {
                return m;
            }

            if(x < v[m]) {
                r = m - 1;
            } else {
                p = m + 1;
            }
        }
        return -1;
    }

    //Selection sort: O(n²)
}