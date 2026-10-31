class Solution {
    public int diagonalSum(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int sum=0;
        for(int i=0;i<r;i++){
            sum+=mat[i][i];
            if (i != r - 1 - i) {
                sum += mat[i][r - 1 - i];
            }
        }
        return sum;
    }
}