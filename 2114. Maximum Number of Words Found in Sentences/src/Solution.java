class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int size = sentences.length;

        for(int i = 0; i < size; i++) {
            int count = 1;
            for(int j = 0; j < sentences[i].length(); j++) {
                if(sentences[i].charAt(j) == ' ') {
                    count++;
                }
            }

            max = Math.max(max, count);
        }

        return max;
    }
}