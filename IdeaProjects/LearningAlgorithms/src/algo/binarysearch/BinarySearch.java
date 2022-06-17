package algo.binarysearch;

public class BinarySearch { // the array must be sorted

    public static void main(String[] args) {
        int[] myList = {0,3,4,5,6,8,9};
        System.out.println(binarySearch(myList, 12)); // the value 8 on the index 5 :)
    }

    public static int binarySearch(int a[], int x){ // the array must be sorted
        int p = 0;
        int r = a.length - 1;
        while (p <= r){
            int q = (p + r)/2;
            if (a[q] == x){
                return q;
            }
            if (a[q] > x){
                r = q - 1;
            }else {
                p = q + 1;
            }
        }
        return -1;
    }
}
