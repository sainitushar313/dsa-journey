public class FindMissingNumber {
    public static int findMissing(int[] arr, int n) {
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int x : arr) {
            actualSum += x;
        }
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        System.out.println(findMissing(arr, n));
    }
}