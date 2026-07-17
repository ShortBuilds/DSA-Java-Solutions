import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        
        Map<String, Integer> rowCounts = new HashMap<>();
        
        for (int[] row : grid) {
            String rowStr = Arrays.toString(row);
            rowCounts.put(rowStr, rowCounts.getOrDefault(rowStr, 0) + 1);
        }
        
        for (int c = 0; c < n; c++) {
            int[] col = new int[n];
            for (int r = 0; r < n; r++) {
                col[r] = grid[r][c];
            }
            
            String colStr = Arrays.toString(col);
            count += rowCounts.getOrDefault(colStr, 0);
        }
        
        return count;
    }
}