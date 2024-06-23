public class RadixSortUtils {
    private static int numLength(int num) {
        // TO DO
        String str = String.valueOf(num);
        return str.length();
    }

    static int getDigitAtIndexOfFromEnd(int num, int index) {
        // TO DO
        if (index >= numLength(num)) {
            return -1;
        }
        String str = String.valueOf(num);
        int digitIndex = str.length() - 1 - index;
        return Integer.parseInt(str.substring(digitIndex, digitIndex + 1));
    }

    static int[] reverseOrder(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    static int maxLength(int[] arr) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentLength = numLength(arr[i]);
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}
