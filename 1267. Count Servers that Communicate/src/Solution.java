class Solution {
    public int countServers(int[][] grid) {

        int rows = grid.length;
        int cols = rows == 0 ? 0 : grid[0].length;

        int[] rowsCount = new int[rows];
        int[] colsCount = new int[cols];

        int servers = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1) {
                    rowsCount[row]++;
                    colsCount[col]++;
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1 && (rowsCount[row] > 1 || colsCount[col] > 1)) {
                    servers++;
                }
            }
        }

        return servers;
    }
}