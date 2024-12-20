public class M_Boquets {
    public boolean isPossible(int[] nums, int day, int m, int k){
        int bouquets = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=day){
                count++;
            }
            else{
                bouquets = bouquets + (count/k);
                count = 0;
            }
        }
        bouquets = bouquets + (count/k);
        if(bouquets>=m)
        return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long num = (long) m*k;
        if(bloomDay.length<num) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>high)
            high = bloomDay[i];
            if(bloomDay[i]<low)
            low = bloomDay[i];
        }
        while(low <= high){
            int mid = low + ((high - low)/2);
            if(isPossible(bloomDay, mid, m, k))
            high = mid - 1;
            else
            low = mid + 1;
        }
        return low;
    }
}
