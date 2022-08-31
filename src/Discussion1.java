public class Discussion1 {
    int[] arr = new int[10];

    public void set(int k, String item) {
        if(k >= arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        //item not a number
        if(!item.matches("[0-9]+")){
            throw new IllegalArgumentException();
        }
        arr[k] = item;
    }
}
