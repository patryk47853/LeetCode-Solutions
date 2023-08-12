class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ans = " ";

        for (int i = 0; i < arr.length; i++) {
            String reversed = " ";
            char[] c_arr = arr[i].toCharArray();
            for (int j = 0; j < c_arr.length; j++) {
                reversed = arr[i].charAt(j) + reversed;
            }

            ans += reversed;
        }

        return new String(ans.trim());
    }
}