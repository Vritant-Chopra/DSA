public class Single_Element_in_Sorted_Array {
    public int singleNonDuplicate(int[] nums) {
        if((nums.length==1) || (nums[0] != nums[1])) return nums[0];
        if(nums[nums.length-2] != nums[nums.length-1]) return nums[nums.length-1];
        int low = 1;
        int high = nums.length-2;
        while(low<=high){
            int mid = low + ((high - low)/2);
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            else if((mid%2==0 && nums[mid] == nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])){
                //left half
                low = mid+1;
            }else{
                //right half
                high = mid-1;
            }
        }
        return -1;
    }
}
