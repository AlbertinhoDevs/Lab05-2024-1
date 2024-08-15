package main.sorter;

public class MergeSort implements Sorter {


    @Override
    public int[] sort(int[] values) {
        if(values.length <= 1){
            return values;
        }

        int mid = values.length/2;
        int[] left = new int[mid];
        int[] right = new int[values.length - mid];

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    public int[] merge(int[] left, int[] right) {
        int i = 0, j = 0;
        int tamanhoEsquerdo = left.length;
        int tamanhoDireito = right.length;
        int k = tamanhoEsquerdo + tamanhoDireito;
        int[] arrayNovo = new int[k];

        while(i < tamanhoEsquerdo && j < tamanhoDireito){
            if(right[i] <= left[j]){
                arrayNovo[k] = right[i];
                i++;
            }else{
                arrayNovo[k] = left[j];
                j++;
            }
            k++;
        }
        return arrayNovo;
    }
}