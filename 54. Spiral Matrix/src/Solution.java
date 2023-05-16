import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if(matrix.length == 0) return result;

        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        int rowStart = 0;
        int rowEnd = matrix.length - 1;

        while (colStart <= colEnd && rowStart <= rowEnd) {
            // Go right
            for (int j = colStart; j <= colEnd; j++) {
                result.add(matrix[rowStart][j]);
            }
            rowStart++;
            // Go down
            for (int j = rowStart; j <= rowEnd; j++) {
                result.add(matrix[j][colEnd]);
            }
            colEnd--;
            // Go left
            if (rowStart <= rowEnd)
                for (int j = colEnd; j >= colStart; j--) {
                    result.add(matrix[rowEnd][j]);
                }
            rowEnd--;
            // Go up
            if (colStart <= colEnd)
                for (int j = rowEnd; j >= rowStart; j--) {
                    result.add(matrix[j][colStart]);
                }
            colStart++;
        }

        return result;
    }
}