import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] rand_arr = new int[1000];

        for(int i = 0; i < 1000; i++) {
            rand_arr[i] = random.nextInt(3000000);
        }


        Bubblesort bubblesort = new Bubblesort(rand_arr);
        bubblesort.bubblesort();
        bubblesort.printarr();

        Heapsort heapsort = new Heapsort(rand_arr);
        heapsort.heapsort();


    }
}
