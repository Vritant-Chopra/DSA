public class Max_Ones {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int maxCount = 0;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            int ones = arr[i].length - ub(arr[i], 0);
            if(ones>maxCount){
                maxCount = ones;
                index = i;
            }
        }
        return index;
    }
    private int ub(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)>>1;
            if(arr[mid]>x)
            high = mid-1;
            else
            low = mid+1;
        }
        return low;
    }
}
