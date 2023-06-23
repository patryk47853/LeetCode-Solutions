class SecondSolution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buckets = new int[101]; // Assuming numbers range from 0 to 100

        for (int num : nums) {
            buckets[num]++;
        }

        int sum = 0;
        for (int i = 0; i < buckets.length; i++) {
            int temp = buckets[i];
            buckets[i] = sum;
            sum += temp;
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = buckets[nums[i]];
        }

        return result;
    }

}