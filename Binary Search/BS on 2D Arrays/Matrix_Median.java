public class Matrix_Median {
    int median(int mat[][]) {
        // code here
        int req = (mat.length*mat[0].length - 1)/2;
        int low = 0;
        int high = 0;
        for(int i=0;i<mat.length;i++){
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][mat[0].length-1]);
        }
        while(low<=high){
            int mid = low + ((high-low)/2);
            int less = lessThan(mat, mid);
            if(less > req)
            high = mid-1;
            else
            low = mid+1;
        }
        return low;
    }
    private int lessThan(int[][] mat, int mid){
        int count = 0;
        for(int i=0;i<mat.length;i++){
            count = count + ub(mat[i], mid);
        }
        return count;
    }
    private int ub(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > x)
            high = mid-1;
            else
            low = mid+1;
        }
        return low;
    }
}
