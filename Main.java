import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    private static final int ASCENDING_ORDER = 1;

    private static void radixSort(int[] nums, boolean ascending) {
        // TO DO:
        Deque<Integer> stack0 = new ArrayDeque<>();
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        Deque<Integer> stack3 = new ArrayDeque<>();
        Deque<Integer> stack4 = new ArrayDeque<>();
        Deque<Integer> stack5 = new ArrayDeque<>();
        Deque<Integer> stack6 = new ArrayDeque<>();
        Deque<Integer> stack7 = new ArrayDeque<>();
        Deque<Integer> stack8 = new ArrayDeque<>();
        Deque<Integer> stack9 = new ArrayDeque<>();

        for (int i = 0; i < RadixSortUtils.maxLength(nums); i++) {
            for (int j = 0; j < nums.length; j++) {
                int num = nums[j];
                switch (RadixSortUtils.getDigitAtIndexOfFromEnd(num, i)) {
                    case -1, 0: stack0.addLast(num); break;
                    case 1: stack1.addLast(num); break;
                    case 2: stack2.addLast(num); break;
                    case 3: stack3.addLast(num); break;
                    case 4: stack4.addLast(num); break;
                    case 5: stack5.addLast(num); break;
                    case 6: stack6.addLast(num); break;
                    case 7: stack7.addLast(num); break;
                    case 8: stack8.addLast(num); break;
                    case 9: stack9.addLast(num); break;
                }
            }
            int index = 0;
            while (stack0.size() != 0) {
                nums[index++] = stack0.removeFirst();
            }
            while (stack1.size() != 0) {
                nums[index++] = stack1.removeFirst();
            }
            while (stack2.size() != 0) {
                nums[index++] = stack2.removeFirst();
            }
            while (stack3.size() != 0) {
                nums[index++] = stack3.removeFirst();
            }
            while (stack4.size() != 0) {
                nums[index++] = stack4.removeFirst();
            }
            while (stack5.size() != 0) {
                nums[index++] = stack5.removeFirst();
            }
            while (stack6.size() != 0) {
                nums[index++] = stack6.removeFirst();
            }
            while (stack7.size() != 0) {
                nums[index++] = stack7.removeFirst();
            }
            while (stack8.size() != 0) {
                nums[index++] = stack8.removeFirst();
            }
            while (stack9.size() != 0) {
                nums[index++] = stack9.removeFirst();
            }
        }
        if (!ascending) {
            nums = RadixSortUtils.reverseOrder(nums);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int order = scanner.nextInt();
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }

        boolean ascending = (order == ASCENDING_ORDER ? true : false);

        radixSort(nums, ascending);

        System.out.println(Arrays.toString(nums));
    }
}
