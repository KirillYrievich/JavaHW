package ru.gb.java.api.lesson1;

public class task2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, -3, 2, 4, -1, 5, -5, 0};
        System.out.println("sum(nums) = " + sum(nums));
    }

    private static int sum(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] < 0) && (nums[i - 1] > 0)) {
                k += nums[i - 1];
            }
        }
        return k;
    }
}
