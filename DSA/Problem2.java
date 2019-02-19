import java.util.Arrays;

public class Problem2 {
    private int[] array;
    private int size;
    private int[] subarray;
    /*
     * 'maxLength' to store the length of longest increasing subarray 'len' to store
     * the lengths of longest increasing subarray at diferent instants of time
     */
    private int maxLength = 1;
    private int len = 1;
    private int start = 0;
    private int startAt = 0;

    Problem2(int size) {
        array = new int[size];

    }

    public int[] longestSubArray() {
        for (int i = 1; i < array.length; i++) {
            // if the previous element is SMALLER than the next element then increment 'len'
            // by 1
            if (array[i - 1] < array[i]) {

                len++;
            } else {
                /*
                 * if the previous element is BIGGER than the next element then make maxLength
                 * equal len (because maxLength will be less len since we increment len once it
                 * fullfil the condition)
                 */

                if (maxLength < len) {
                    maxLength = len;
                    startAt = start;

                }
                /*
                 * reset 'len' to 1 as from this element again the length of the new increasing
                 * subarray is being calculated
                 */
                len = 1;
                start = i; // start will be same as i (index that didn't fullfil the condition)
            }
        }
        /*
         * comparing the length of the last increasing subarray with 'maxLength'
         */
        if (maxLength < len) {
            maxLength = len;
            startAt = start;
        }
        /*
         * the subarray length will be maxLength(when we found increasing elements then
         * +1) copy elements from array at startAt to subarray at index 0 which will be
         * of length maxLength
         */
        subarray = new int[maxLength];
        System.arraycopy(array, startAt, subarray, 0, maxLength);
        System.out.println(Arrays.toString(subarray));
        return subarray;
    }

    public void print() {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

    public void add(int p, int el) {
        array[p] = el;

    }

}
