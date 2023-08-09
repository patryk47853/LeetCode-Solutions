class Solution {
    public int countDigits(int num) {
        int sum = 0;
        int temp = num;

        if (num < 10) return 1;
        else {
            while (temp != 0) {
                int digit = temp % 10;
                if (num % digit == 0) sum++;
                temp /= 10;
            }
        }

        return sum;
    }
}