public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        //basically find the upper bound
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(nums[mid] < target)
            low = mid+1;
            else
            high = mid-1;
        }
        return low;
    }
}
