class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> indexMap = new HashMap();

        for(String word : s.split(" ")) {
            int lastIndex = word.length() - 1;

            int index = word.charAt(lastIndex) - '0';
            String actualWord = word.substring(0, lastIndex);

            indexMap.put(index, actualWord);
        }

        StringBuilder actualString = new StringBuilder();
        for(Map.Entry<Integer, String> indexes : indexMap.entrySet()) {
            actualString.append(indexes.getValue());
            actualString.append(" ");
        }

        return actualString.toString().trim();
    }
}