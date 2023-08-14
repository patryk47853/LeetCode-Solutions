class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int counter = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int n : nums) {
            list.add(n);
        }

        for (int l : list) {
            if (list.contains(l + diff) && list.contains(l + diff + diff)) {
                counter++;
            }
        }


        return counter;
    }
}