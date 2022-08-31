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
    }

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

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public void selectionSort() {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = pickMaxIndex(arr, i, arr.length - 1);
            swap(arr, i, maxIndex);
        }
    }

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
