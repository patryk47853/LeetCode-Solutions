import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int digits1[] = {1,2,3};
        int digits2[] = {4,3,2,1};

        plusOne(digits1);
        plusOne(digits2);

        System.out.println(Arrays.toString(digits1)); // should return 1,2,4
        System.out.println(Arrays.toString(digits2)); // should return 4,3,2,2

    }

    public static int[] plusOne(int[] digits) {

        int maxIndex = digits.length - 1;

        for(int i = maxIndex; i >=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }
}