class MinValueStepSum {
    public static int minStartValue(int[] nums) {
        int minValue = 0, runningSum = 0;

        for (int num : nums) {
            runningSum += num;
            minValue = Math.min(minValue, runningSum);
        }

        return 1 - minValue;
    }

    public static void main(String[] args) {
        int[] nums = { -3, 2, -3, 4, 2 };
        System.out.println("Minimum Start Value: " + minStartValue(nums));
    }
}