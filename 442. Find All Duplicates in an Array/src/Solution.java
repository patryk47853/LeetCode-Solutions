class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for(int num : nums) {
            if(!unique.contains(num)) {
                unique.add(num);
            } else duplicates.add(num);
        }

        return duplicates;
    }
}