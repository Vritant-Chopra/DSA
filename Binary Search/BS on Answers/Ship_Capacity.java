public class Ship_Capacity {
    public int shipWithinDays(int[] weights, int days) {
        int low = weights[0];
        int high = weights[0];
        for(int i=1;i<weights.length;i++){
            low = Math.max(weights[i], low);
            high = high + weights[i];
        }
        while(low<=high){
            int mid = low + ((high-low)/2);
            if(isPossible(mid,weights) <= days)
            high = mid-1;
            else
            low = mid+1;
        }
        return low;
    }
    public int isPossible(int capacity, int[] weights){
        int days = 0;
        int current = 0;
        for(int i=0;i<weights.length;i++){
            current = current + weights[i];
            if(current > capacity){
                current = weights[i];
                days++;
            }
        }
        if(current>0)
        days++;
        return days;
    }
}
