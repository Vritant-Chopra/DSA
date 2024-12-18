public class Search_Range {
    public int[] searchRange(int[] nums, int target) {
        if(findElement(nums, target) == -1)
        return new int[]{-1,-1};
        return new int[]{lb(nums,target)+1, ub(nums,target)-1};
    }
    public int findElement(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(nums[mid] == target)
            return mid;
            else if(nums[mid] < target)
            low = mid+1;
            else
            high = mid-1;
        }
        return -1;
    }
    public int lb(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(nums[mid] >= target)
            high = mid-1;
            else
            low = mid+1;
        }
        return high;
    }
    public int ub(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(nums[mid] <= target)
            low = mid+1;
            else
            high = mid-1;
        }
        return low;
    }
}
