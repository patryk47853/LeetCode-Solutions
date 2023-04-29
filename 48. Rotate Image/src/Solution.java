public class Solution {
    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;

        int n = matrix.length;

        for(int i=0; i < (n+1)/2; i++) {
            for(int j=0; j < n/2; j++) {

                // temp --> bottom left
                int temp = matrix[n - 1 - j][i];

                // bottom left is now --> bottom right value
                matrix[n - 1 - j][i] = matrix[n - 1 -i][n - 1 -j];

                // bottom right is now --> top right value
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];

                // top right is now --> top left value
                matrix[j][n - 1 - i] = matrix[i][j];

                // top left is now --> bottom left value (temp)
                matrix[i][j] = temp;
            }
        }
    }
}