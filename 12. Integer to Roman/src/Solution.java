public class Solution {

    public static void main(String[] args) {

        System.out.println(intToRoman(3)); // Output: "III"
        System.out.println(intToRoman(58)); // Output: "LVIII"
        System.out.println(intToRoman(1994)); // Output: "MCMXCIV"
    }

    public static String intToRoman(int num) {

        String thousands[] = {"", "M", "MM", "MMM"};
        String hundreds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String unities[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num/1000] + hundreds[(num%1000) / 100] + tens[(num%100) / 10] + unities[num%10];
    }
}