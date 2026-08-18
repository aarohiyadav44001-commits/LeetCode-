class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return ans;
        }

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            
            // 1. Top boundary (Left to Right)
            for (int j = startCol; j <= endCol; j++) {
                ans.add(matrix[startRow][j]); 
            }

            // 2. Right boundary (Top to Bottom)
            for (int i = startRow + 1; i <= endRow; i++) {
                ans.add(matrix[i][endCol]); 
            }

            // 3. Bottom boundary (Right to Left)
            if (startRow < endRow) { 
                for (int j = endCol - 1; j >= startCol; j--) {
                    ans.add(matrix[endRow][j]);
                }
            }
            // 4. Left boundary (Bottom to Top)
            if (startCol < endCol) {
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    ans.add(matrix[i][startCol]);
                }
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        
        return ans;
    }
}


