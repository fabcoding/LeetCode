public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int initx = 0;
        if (matrix.length != 0) {
            initx = matrix[0].length - 1;
        }
        int inity = matrix.length - 1;
        int x = initx;
        int y = inity;
        while (y >= 0 && x >= 0) {
            int rowOffset = (inity - y) / 2;
            int colOffset = (initx - x) / 2;
            for (int i = colOffset; i <= initx - colOffset; i++) {
                res.add(matrix[rowOffset][i]);
            }
            for (int i = rowOffset + 1; i <= inity - rowOffset - 1; i++) {
                res.add(matrix[i][initx - colOffset]);
            }
            if (inity - rowOffset != rowOffset) {
                for (int i = initx - colOffset; i >= colOffset; i--) {
                    res.add(matrix[inity - rowOffset][i]);
                }
            }
            if (initx - colOffset != colOffset) {
                for (int i = inity - rowOffset - 1; i >= rowOffset + 1; i--) {
                    res.add(matrix[i][rowOffset]);
                }
            }
            x = x - 2;
            y = y - 2;
        }
        return res;
    }
}