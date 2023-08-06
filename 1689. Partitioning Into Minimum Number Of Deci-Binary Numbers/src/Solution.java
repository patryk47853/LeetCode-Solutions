class Solution {
    public int minPartitions(String n) {
        int maxDigit = Integer.MIN_VALUE;
        char arr[] = n.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] - '0' > maxDigit) {
                maxDigit = arr[i] - '0';
            }
        }

        return maxDigit;
    }
}