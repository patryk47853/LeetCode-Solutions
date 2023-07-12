class SlowAcceptedSolution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> table = new HashMap<>();

        for (int num : nums) {
            table.put(num, table.getOrDefault(num, 0) + 1);
        }

        for (int i : table.keySet()) {
            if (table.get(i) > 1) ans.add(i);
        }

        return ans;
    }
}