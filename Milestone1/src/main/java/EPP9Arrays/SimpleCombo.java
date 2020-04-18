/**
 * combine into one large array
 */
package EPP9Arrays;

public class SimpleCombo {

    /**
     * Combine two arrays
     * @param a - an array of ints
     * @param b - an array of ints
     * @return {int[]} combined array, with b stuck to the end of a
     */
    public static int[] combineArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        //copy a
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        //copy b, with a.length as offset for index
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49};
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100};

        int[] combinedArray = new int[24];
        combinedArray = combineArrays(firstHalf, secondHalf);

        for (int i = 0; i < combinedArray.length; i++) {
            System.out.print(combinedArray[i] + " ");
        }
    }
}
