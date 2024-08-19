package sorter;

public class QuickSorter implements Sorter {
    public int[] sort(int[] values) {
        quicksort(values, 0, values.length - 1);
        return values;
    }

    private void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high); // Índice do pivô
            quicksort(array, low, pi - 1);  // Ordena a parte antes do pivô
            quicksort(array, pi + 1, high); // Ordena a parte depois do pivô
        }
    }

    public int partition(int[] values, int low, int high) {
         int pivot = values[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (values[j] <= pivot) {
                i++;

                int temp = values[i];
                values[i] = values[j];
                values[j] = temp;
            }
        }

        int temp = values[i + 1];
        values[i + 1] = values[high];
        values[high] = temp;

        return i + 1;
    }
    
}
