package recursion;

public class RecursionApp {
    public static void main(String[] args) {
//        reduceByOne(5);
//        System.out.println(recursiveLinearSearch(new int[] {4,45,32,42,64,13,7,70,9}, 0, 64));
        int[] a = {2,4,56,78,34,6,89, 4,45,32,42,64,13,7,7};
        System.out.println(recusiveBinarySearch(a,0,a.length-1,13));
    }

    public static void reduceByOne(int n){
        if (n >= 0){
        reduceByOne(n-1);
    }
        System.out.println("Completed Call: " + n);
    }


    public static int recursiveLinearSearch(int a[],int i, int x){ // i- index position
        if (i > a.length - 1){ // if evaluates to true, x was not found in the array
            return -1 ;
        } else if (a[i] == x) {
            return i;
        }else {
            System.out.println("Index at: " + i);
            return recursiveLinearSearch(a, i+1, x);
        }
    }

    public static int recusiveBinarySearch(int[] a, int p, int r, int x){
        System.out.println("[ " + p + "..." + r + " ]");
        if (p > r){
            return -1;
        } else {
            int q = (p + r)/2;
            if (a[q] == x){
                return q;
            } else if (a[q] > x) {
                return recusiveBinarySearch(a, p, q-1, x);
            } else {
                return recusiveBinarySearch(a, q+1, r,x);
            }
        }
    }

}
