public class OrdenacaoVetor {

    // Ordenação do vetor através do BubbleSort
    public static void ordenarBubbleSort(int[] array) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        long fim = System.currentTimeMillis();
        System.out.println("Vetor - Tempo de ordenacao Bubble Sort: " + (fim - inicio) + "ms");
    }
    
    // Ordenação do vetor através do MergeSort
    public static void ordenarMergeSort(int[] array) {
        long inicio = System.currentTimeMillis();
        mergeSort(array, 0, array.length - 1);
        long fim = System.currentTimeMillis();
        System.out.println("Vetor - Tempo de ordenacao Merge Sort: " + (fim - inicio) + "ms");
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }
}
