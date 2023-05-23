class SecondSolution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> search = new HashSet<>();

        for(int num : nums) {
            search.add(num);
        }

        int longest = 0;

        for(int num : nums) {
            if(!search.contains(num - 1)) {
                int current = 0;

                while(search.contains(num + current)) {
                    current += 1;
                }

                longest = Math.max(longest, current);
            }
        }

        return longest;
    }
}
Console
