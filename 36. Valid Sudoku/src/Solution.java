import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] board2 = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board)); // should return true
        System.out.println(isValidSudoku(board2)); // should return false
    }

    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> isThere = new HashSet();

        for(int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                char tempVal = board[i][j];

                if (tempVal != '.') {
                         if(!isThere.add(tempVal + "found in row"  + i) ||
                            !isThere.add(tempVal + "found in column" + j) ||
                            !isThere.add(tempVal + "found in cube" + i/3 + "-" + j/3))
                        return false;
                }
            }
        }

        return true;
    }
}