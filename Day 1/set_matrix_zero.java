class Solution {
    public void setZeroes(int[][] matrix) {
        int rowsize = matrix.length;
        int colsize = matrix[0].length;
        int[] rows = new int[rowsize];
        int[] cols = new int[colsize];
        
        for(int i = 0;i < rowsize;i++){
            for(int j = 0;j < colsize;j++){
                if(matrix[i][j] == 0){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        for(int i = 0;i < rowsize;i++){
            if(rows[i] == 1){
                for(int j = 0;j < colsize;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 0;j < colsize;j++){
            if(cols[j] == 1){
                for(int i = 0;i < rowsize;i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
