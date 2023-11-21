// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bubblesort {
    private int[] arr;
    Bubblesort() {

    }
    Bubblesort(int[] arr) {
        this.arr = arr;
    }

    public void bubblesort() {
        int temp = 0;
        // iterate over each element
        for(int i = 0; i < arr.length; i++) {
            // iterate till second last index
            // each time one less index is traversed
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j+1] < arr[j]) {
                    // swap elements
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }

    public void printarr() {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}