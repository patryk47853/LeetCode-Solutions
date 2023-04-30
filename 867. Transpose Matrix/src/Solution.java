import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.deepToString(transpose(matrix))); // Output: [[1,4,7],[2,5,8],[3,6,9]]
    }

    public static int[][] transpose(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return matrix;

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for(int i=0; i<columns; i++) {
            for(int j=0; j<rows; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        return result;
    }
}