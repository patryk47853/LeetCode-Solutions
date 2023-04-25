import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> answer = new HashMap<>();

        for(String s : strs) {
            char[] strAsChar = s.toCharArray();
            Arrays.sort(strAsChar);
            String strKey = String.valueOf(strAsChar);
            if(!answer.containsKey(strKey)) answer.put(strKey, new ArrayList<>());
                answer.get(strKey).add(s);
            }

        return new ArrayList<>(answer.values());
    }
}