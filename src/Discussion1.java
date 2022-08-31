import java.util.Random;

public class Discussion1 {
    int[] arr = new int[100];

    public void setKthItem(int k, String item) {
        if (k >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        //item not a number
        else if (!item.matches("[0-9]*")) {
            throw new IllegalArgumentException();
        } else {
            arr[k] = Integer.parseInt(item);
        }
    }//Use the assignment statement to assign a value to the kth bit of the array.

    public static int pickMaxIndex(int[] arr, int start, int end) {
        int max = arr[start];
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    /*Set a temporary maximum value and a temporary index.
    If the next number in the array is larger than the temporary maximum value,
    update the temporary maximum value with the next number and write its index to the temporary index.
    Repeat this to get the index with the maximum value.
     */

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*Create a temporary variable, first assign the value of variable i to the temporary variable,
    then assign the value of variable j to variable i,
    and finally assign the value of the temporary variable to variable j.
    The exchange of the values of the two variables is completed.
     */
    public void selectionSort() {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = pickMaxIndex(arr, i, arr.length - 1);
            swap(arr, i, maxIndex);
        }
    }
    /*
    In the process of subtracting one from i to the array length,
    find the largest number and exchange it with the ith number. The next time you find the number,
    start from i + 1. Repeat this process,
    and the largest number will be continuously exchanged to the beginning of the array.
     */

    public static void main(String[] args) {
        Discussion1 d1 = new Discussion1();
        for (int i = 0; i < d1.arr.length; i++) {
            d1.setKthItem(i, new Random().nextInt(100) + "");
        }
        d1.selectionSort();
        for (int i = 0; i < d1.arr.length; i++) {
            System.out.println(d1.arr[i]);
        }
    }
}
