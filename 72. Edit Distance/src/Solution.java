class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // Create a 2D array to store minimum edit distances
        int[][] countDP = new int[m + 1][n + 1];

        // Initialize the first row and column
        for (int i = 1; i <= m; i++) {
            countDP[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            countDP[0][j] = j;
        }

        // Fill in the rest of the array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    countDP[i][j] = countDP[i - 1][j - 1];
                } else {
                    int topLeft = countDP[i - 1][j - 1];
                    int bottomLeft = countDP[i][j - 1];
                    int topRight = countDP[i - 1][j];

                    countDP[i][j] = Math.min(topLeft, Math.min(bottomLeft, topRight)) + 1;
                }
            }
        }

        return countDP[m][n];
    }
}