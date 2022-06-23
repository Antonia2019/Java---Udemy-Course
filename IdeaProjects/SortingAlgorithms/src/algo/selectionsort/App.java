package algo.selectionsort;

public class App {

    public static void main(String[] args) {
        int[] myArray = selectionSort(new int[]{9,8,3,13,87,12,99});
        for (int i=0; i< myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    public static int[] selectionSort(int A[]){
        for(int i = 0; i< A.length-1; i++){
            int minimum = i;
            for (int j=i+1; j<A.length; j++){
                if (A[j] < A[minimum]){ //IF WE FIND A SMALLER VALUE
                    minimum = j;
                }
            }
            int temp = A[i];
            A[i] = A[minimum];
            A[minimum] = temp;

        }
        return A;
    }
}
