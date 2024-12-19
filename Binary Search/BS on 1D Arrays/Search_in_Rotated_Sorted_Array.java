public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(nums[mid] == target)
            return mid;
            else if(nums[mid]>nums[low]){
                //left half sorted
                if(nums[low]<=target && target<=nums[mid]){
                    high = mid - 1;
                }
                else
                low = mid+1;
            }else{
                //right half sorted
                if(nums[mid]<=target && target<=nums[high]){
                    low = mid+1;
                }
                else
                high = mid-1;
            }
        }
        return -1;
    }
}
