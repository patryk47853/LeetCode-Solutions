class Solution {
    public int minimumSum(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);

        return Integer.parseInt("" + arr[0] + "" + arr[2]) + Integer.parseInt("" + arr[1] + "" + arr[3]);
    }
}