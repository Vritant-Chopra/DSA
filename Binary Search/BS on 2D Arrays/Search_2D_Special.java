public class Search_2D_Special {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while(row>=0 && row<matrix.length && col>=0 && col<matrix[0].length){
            int element = matrix[row][col];
            if(element == target)
            return true;
            else if(element < target)
            row++;
            else
            col--;
        }
        return false;
    }
}
