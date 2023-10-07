
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int smallNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallNumber > array[i]) {
                smallNumber = array[i];
            }
        }
        return smallNumber;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest(array) == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallNum = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (smallNum > table[i]) {
                smallNum = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap1 = array[index1];
        int swap2 = array[index2];

        array[index1] = swap2;
        array[index2] = swap1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfSmallestFrom(array, i), i);
        }
    }
}
