public class Split_Array_Largest_Sum {
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = nums[0];
        for(int i=1;i<nums.length;i++){
            high = high + nums[i];
            low = Math.max(low, nums[i]);
        }
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(subarrays(nums,mid) <= k)
            high = mid-1;
            else
            low = mid+1;
        }
        return low;
    }
    private int subarrays(int[] nums, int maxSum){
        int sum = 0;
        int arrays = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum > maxSum){
                sum = nums[i];
                arrays++;
            }
        }
        if(sum>0)
        arrays++;
        return arrays;
    }
}
