package algo.linearsearch;

public class LinearSearch {

    public static void main(String[] args) {
        int[] myList = {0,3,4,5,6,8,9};

        System.out.println(linearSearch(myList, 9));

    }

    public static int linearSearch(int a[], int x){ // the array is not sorted
        for (int i = 0; i< a.length; i++){
            if (a[i] == x){
                return i;
            }
        }
        return -1;
    }

}
