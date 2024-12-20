public class Smallest_Divisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = nums[0];
        for(int i=1;i<nums.length;i++){
            high = Math.max(high,nums[i]);
        }
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(isPossible(mid, nums) <= threshold)
            high = mid-1;
            else
            low = mid+1;
        }
        return low;
    }
    public int isPossible(int divisor, int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + (int)Math.ceil(nums[i]/(divisor*1.0));
        }
        return sum;
    }
}