/*
Healthy Heart
Author: Narish Singh
Date Created: 4/21/20
Last Modified: 4/21/20
 */
package SummativeAssessment;

public class SummativeSums {

    /**
     * Add up elements of int array
     *
     * @param a {int[]} can contain positive or negative integers
     * @return {int} the sum of all elements in the array
     */
    public static int arraySum(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] exArray1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] exArray2 = {999, -60, -77, 14, 160, 301};
        int[] exArray3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
            140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("Sum of Array Elements:");
        System.out.println("Array 1 = " + arraySum(exArray1));
        System.out.println("Array 2 = " + arraySum(exArray2));
        System.out.println("Array 3 = " + arraySum(exArray3));
    }
}
