package hitesh;

public class BinarySearch {

    public static void main(String[] args) {
        binarySearchStandard(new int[]{2, 4, 6, 8, 10, 12, 14, 16}, 16);
        binarySearch2(new int[]{2, 4, 6, 8, 10, 12, 14, 16}, 7);
    }

    /**
     * Standard way to do binary search
     * start = mid + 1
     * end = mid - 1
     * start <= end
     * In this approach because we are checking nums[mid] == target, we can skip the
     * mid value from start and end by adding and subtracting 1
     */
    private static void binarySearchStandard(int[] nums, int target) {
        printArray(nums);
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        int mid = (end - start) / 2 + start;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (nums[mid] == target) {
                printLog(start, end, mid, nums);
                result = mid;
                break;
            } else if (nums[mid] < target) {
                printLog(start, end, mid, nums);
                start = mid + 1;
            } else {
                printLog(start, end, mid, nums);
                end = mid - 1;
            }
        }
        printLog(start, end, mid, nums);
        System.out.println("Final result index " + result);
    }

    /**
     * Standard way to do binary search
     * start = mid + 1
     * end = mid
     * start < end
     * Here start and end never gets out of bound
     * The while loop only exits when start == end, which means there's only one element left.
     * And if we implemented everything correctly,
     * that only element should be our answer(assume if the target is in the array).
     */
    private static void binarySearch2(int[] nums, int target) {
        printArray(nums);
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        int mid = (end - start) / 2 + start;
        while (start < end) {
            mid = (end - start) / 2 + start;
            /*if the target is greater than mid then there is no way mid will be our answer so,
            we can exclude mid by "start = mid + 1"
            In else mid can still be the target so we keep it "end = mid"
             */
            if (nums[mid] < target) {
                printLog(start, end, mid, nums);
                start = mid + 1;
            } else {
                printLog(start, end, mid, nums);
                end = mid;
            }
        }
        printLog(start, end, mid, nums);
        //in this case we need to check the last item left
        result = nums[start] == target ? start : -1;
        System.out.println("Final result index " + result);
    }

    private static void printLog(int start, int end, int mid, int[] nums) {
        System.out.println("start: " + start + " (" + ")" + " | "
                + "mid: " + mid + " (" + nums[mid] + ")" + " | "
                + "end: " + end + " (" + ")");
    }

    private static void printArray(int[] nums) {
        StringBuilder sbArray = new StringBuilder();
        StringBuilder sbIndexes = new StringBuilder();
        sbArray.append("[");
        sbIndexes.append("[");
        for (int i = 0; i < nums.length; i++) {
            sbArray.append(nums[i]).append(",");
            if (nums[i] > 9) {
                sbIndexes.append(i).append(" ").append(",");
            } else {
                sbIndexes.append(i).append(",");
            }
        }
        sbArray.append("]");
        sbIndexes.append("]");
        System.out.println(sbArray.toString());
        System.out.println(sbIndexes.toString());
    }
}
