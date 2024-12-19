public class Min_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(nums[low]<=nums[mid]){
                //left half sorted
                min = Math.min(min,nums[low]);
                low = mid+1;
            }
            else{
                //right half sorted
                min = Math.min(min,nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }
}
