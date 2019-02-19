
public class Problem2Test {
    public static void main(String[] args) {
        Problem2 array = new Problem2(7);
        array.add(0, 1);
        array.add(1, 2);
        array.add(2, 7);
        array.add(3, 6);
        array.add(4, 12);
        array.add(5, 10);
        array.add(6, 13);
        System.out.print("the whole array is :");
        array.print();
        System.out.println("The subarray is");
        array.longestSubArray();

        Problem2 array2 = new Problem2(7);
        array2.add(0, 15);
        array2.add(1, 6);
        array2.add(2, 7);
        array2.add(3, 4);
        array2.add(4, 12);
        array2.add(5, 17);
        array2.add(6, 1);

        System.out.print("the whole array is :");
        array2.print();
        System.out.println("The subarray is");
        array2.longestSubArray();

        Problem2 array3 = new Problem2(15);
        array3.add(0, 15);
        array3.add(1, 6);
        array3.add(2, 7);
        array3.add(3, 4);
        array3.add(4, 0);
        array3.add(5, 20);
        array3.add(6, 21);
        array3.add(7, 22);
        array3.add(8, 23);
        array3.add(9, 24);
        array3.add(10, 25);
        array3.add(11, 26);
        array3.add(12, 1);
        array3.add(13, 2);
        array3.add(14, 3);

        System.out.print("the whole array is :");
        array3.print();
        System.out.println("The subarray is");
        array3.longestSubArray();

    }
}