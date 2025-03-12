class Solution {
    public int diagonalSum(int[][] mat) {
        int sumpd =0;
        int sumd =0;
        for(int i=0; i<mat.length; i++){
            sumpd += mat[i][i];
            sumd += mat[i][mat.length -1 -i];
        }
        if(mat.length%2!=0 && mat.length > 1){
            return sumpd+sumd-mat[(mat.length/2)][(mat.length/2)];
        }
        if(mat.length == 1){
            return sumpd;
        }
        return sumpd+sumd;
    }
}