import java.util.Arrays;

public class Lower_and_Upper_Bound {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        return new int[]{lb(arr,x),ub(arr,x)};
    }
    public int lb(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(arr[mid] > x)
            high = mid-1;
            else
            low = mid+1;
        }
        if(high == -1)
        return -1;
        return arr[high];
    }
    public int ub(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(arr[mid] < x)
            low = mid+1;
            else
            high = mid-1;
        }
        if(low == arr.length)
        return -1;
        return arr[low];
    }
}
