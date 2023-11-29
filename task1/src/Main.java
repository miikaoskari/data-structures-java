import java.util.Calendar;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] rand_arr = gen_arr(1000);
        int[] rand_arr2 = gen_arr(10000);
        int[] rand_arr3 = gen_arr(100000);
        int[] rand_arr4 = gen_arr(1000000);
        //int[] rand_arr5 = gen_arr(10000000);

        test_bubblesort(rand_arr);


        test_heapsort(rand_arr4);

    }
    private static void test_bubblesort(int[] rand_arr) {
        Calendar time1 = Calendar.getInstance();
        long start1 = time1.getTimeInMillis();
        Bubblesort bubblesort = new Bubblesort(rand_arr);
        bubblesort.bubblesort();
        Calendar time2 = Calendar.getInstance();
        long end1 = time2.getTimeInMillis();
        System.out.println("Time taken for array size of " + rand_arr.length + ": " + (end1 - start1) + "ms");
    }

    private static void test_heapsort(int[] rand_arr) {
        Calendar time3 = Calendar.getInstance();
        long start2 = time3.getTimeInMillis();
        Heapsort heapsort = new Heapsort(rand_arr);
        heapsort.heapsort();
        Calendar time4 = Calendar.getInstance();
        long end2 = time4.getTimeInMillis();
        System.out.println("Time taken for array size of " + rand_arr.length + ": " + (end2 - start2) + "ms");
    }

    private static int[] gen_arr(int size) {
        Random random = new Random();

        int[] rand_arr = new int[size];

        for(int i = 0; i < size; i++) {
            rand_arr[i] = random.nextInt(3000000);
        }

        return rand_arr;
    }
}
