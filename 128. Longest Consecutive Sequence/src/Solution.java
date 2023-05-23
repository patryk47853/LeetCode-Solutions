class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer, Boolean> search = new HashMap<>();
        for (int num : nums) {
            search.put(num, Boolean.FALSE);
        }

        for (int num : nums) {
            int currentLength = 1;

            // Forward -->
            int next = num + 1;
            while (search.containsKey(next) && search.get(next) == false) {
                currentLength++;
                search.put(next, Boolean.TRUE);

                next++;
            }

            // <-- Backward
            int previous = num - 1;
            while (search.containsKey(previous) && !search.get(previous)) {
                currentLength++;
                search.put(previous, Boolean.TRUE);

                previous--;
            }

            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }
}