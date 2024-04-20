package sorting;

class insertionSort {
    public static void main(String[] args) {
        int[] array = { 1, 3, 2, 5, 2, 7, 1, 2, 4, 2, 9, 1, 1, 2, 9, 1 };
        sort(array);

    }

    static int[] sort(int[] array) {
        for (int index = 1; index < array.length; index++) {
            int tempVariable = array[index];
            int innerIndex = index - 1;

            while (innerIndex >= 0 && array[innerIndex] > tempVariable) {
                array[innerIndex + 1] = array[innerIndex];
                innerIndex--;
            }
            array[innerIndex + 1] = tempVariable;
        }
        // for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);
        // }
        return array;
    }
}