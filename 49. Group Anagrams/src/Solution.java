import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> frequencyMap = new HashMap<>();

        for (String string : strs) {
            String frequencyString = getFrequencyString(string);

            if (frequencyMap.containsKey(frequencyString)) {
                frequencyMap.get(frequencyString).add(string);
            } else {
                List<String> stringsList = new ArrayList<>();
                stringsList.add(string);
                frequencyMap.put(frequencyString, stringsList);
            }
        }

        return new ArrayList<>(frequencyMap.values());
    }

    public static String getFrequencyString(String string) {

        int[] frequency = new int[26]; // 26 letters in alphabet

        for(char c: string.toCharArray()) {
            frequency[c - 'a']++;
        }

        StringBuilder frequencyString = new StringBuilder("");
        char c = 'a';
        for (int i : frequency) {
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }

        return frequencyString.toString();
    }
}