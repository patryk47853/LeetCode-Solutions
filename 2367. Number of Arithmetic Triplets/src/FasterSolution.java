class FasterSolution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int counter = 0;

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        for (int n : nums) {
            if (set.contains(n + diff) && set.contains(n + 2 * diff)) {
                counter++;
            }
        }

        return counter;
    }
}
