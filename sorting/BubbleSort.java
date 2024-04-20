package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 1, 3, 2, 5, 2, 7, 1, 2, 4, 2, 9, 1, 1, 2, 9, 1 };
        sort(array);
    }

    public static int[] sort(int[] array) {
        for (int outerLoop = array.length - 1; outerLoop > 0; outerLoop--) {
            for (int innerLoop = 0; innerLoop < outerLoop; innerLoop++) {
                if (array[innerLoop + 1] < array[innerLoop]) {
                    int tempVariable = array[innerLoop];
                    array[innerLoop] = array[innerLoop + 1];
                    array[innerLoop + 1] = tempVariable;
                }
            }
        }
        // for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);
        // }

        return array;
    }

}

// 3 4 1 3 1 4 1 6 3
