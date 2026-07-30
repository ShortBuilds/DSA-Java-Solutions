class Solution {
    public boolean isValidSudoku(char[][] board) {
        // We need tracking arrays for 9 rows, 9 columns, and 9 sub-boxes.
        // Each array needs 9 slots (to track digits 1-9).
        boolean[][] seenInRow = new boolean[9][9];
        boolean[][] seenInCol = new boolean[9][9];
        boolean[][] seenInBox = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char current = board[r][c];

                if (current == '.') {
                    continue;
                }

                // Convert char '1'-'9' to index 0-8
                int val = current - '1';
                
                // Calculate which 3x3 box we are in (0-8)
                int boxIndex = (r / 3) * 3 + (c / 3);

                // If we've already seen this value in the row, col, or box, it's invalid
                if (seenInRow[r][val] || seenInCol[c][val] || seenInBox[boxIndex][val]) {
                    return false;
                }

                // Mark the value as seen
                seenInRow[r][val] = true;
                seenInCol[c][val] = true;
                seenInBox[boxIndex][val] = true;
            }
        }

        return true;
    }
}