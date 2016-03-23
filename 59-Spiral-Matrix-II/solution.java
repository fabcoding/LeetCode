public class Solution {
    public int[][] generateMatrix(int n) {
        n = Math.abs(n);
        int[][] res = new int[n][];
        for (int i = 0; i < n; i++) {
            res[i] = new int[n];
        }
        n = n - 1;
        int x = n;
        int y = n;
        int value = 1;
        while (y >= 0 && x >= 0) {
            int rowOffset = (n - y) / 2;
            int colOffset = (n - x) / 2;
            for (int i = colOffset; i <= n - colOffset; i++) {
                res[rowOffset][i] = value++;
            }
            for (int i = rowOffset + 1; i <= n - rowOffset - 1; i++) {
                res[i][n - colOffset] = value++;
            }
            if (n - rowOffset != rowOffset) {
                for (int i = n - colOffset; i >= colOffset; i--) {
                    res[n - rowOffset][i] = value++;
                }
            }
            if (n - colOffset != colOffset) {
                for (int i = n - rowOffset - 1; i >= rowOffset + 1; i--) {
                    res[i][rowOffset] = value++;
                }
            }
            x = x - 2;
            y = y - 2;
        }
        return res;
    }
}