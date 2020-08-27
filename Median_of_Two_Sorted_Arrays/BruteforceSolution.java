package Median_of_Two_Sorted_Arrays;

public class BruteforceSolution {
    public static void bubbleSort(int[] nums) {
        boolean flag;
        int tmp, len = nums.length;

        while (true) {
            flag = false;

            for (int i = 1; i < len; i++) {
                if (nums[i - 1] > nums[i]) {
                    flag = true;
                    tmp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = tmp;
                }
            }

            if (!flag) break;
        }

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        int len1, len2, len3;

        len1 = nums1.length;
        len2 = nums2.length;
        len3 = len1 + len2;
        int[] all = new int[len1 + len2];

        for (int i = 0; i < len1; i++) {
            all[i] = nums1[i];
        }

        for (int i = 0; i < len2; i++) {
            all[i + len1] = nums2[i];
        }

        bubbleSort(all);
        result = (len3 % 2 == 1) ? all[len3 / 2] : (double) (all[len3 / 2] + all[len3 / 2 - 1]) / 2;
        return result;
    }

    public static void main(String[] args) {
        System.out.print("nums1 = [1,3], nums2 = [2]. The median is ");
        System.out.print(String.format("%f\n", (findMedianSortedArrays(new int[] { 3 }, new int[] { -2, -1 }))));

    }
}