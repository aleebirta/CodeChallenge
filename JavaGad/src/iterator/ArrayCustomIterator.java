package iterator;

public class ArrayCustomIterator {

    private int[] arr;
    private int currentIndex;

    public ArrayCustomIterator(int arr[]) {
        this.arr = arr;
        this.currentIndex = 0;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while(it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
    }

    public boolean hasNext() {
        return this.currentIndex < this.arr.length;
    }

    public int next() {
        return this.arr[this.currentIndex++];
    }
}
