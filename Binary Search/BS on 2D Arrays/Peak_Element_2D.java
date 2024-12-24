public class Peak_Element_2D {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length-1;
        if(mat.length == 1 && mat[0].length == 1)
        return new int[]{0,0};
        while(low<=high){
            int mid = low + ((high-low)/2);
            int rowMax = maxInCol(mid, mat);
            int left = mid-1>=0 ? mat[rowMax][mid-1] : -1;
            int right = mid+1<mat[0].length ? mat[rowMax][mid+1] : -1;
            if(mat[rowMax][mid] > left && mat[rowMax][mid] > right)
            return new int[]{rowMax,mid};
            else if(mat[rowMax][mid] <= left)
            high = mid-1;
            else
            low = mid+1;
        }
        return new int[]{-1,-1};
    }
    private int maxInCol(int col, int[][] mat){
        int index = -1;
        int max = -1;
        for(int i=0;i<mat.length;i++){
            if(max < mat[i][col]){
                max = mat[i][col];
                index = i;
            }
        }
        return index;
    }
}
