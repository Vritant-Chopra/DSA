public class Koko_Eating_Bananas {
    public long hours(int mid, int[] piles){
        long hours = 0;
        for(int i=0;i<piles.length;i++){
            hours = hours + (long)Math.ceil(piles[i]/(mid*1.0));
        }
        System.out.println(mid+" : "+hours);
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        for(int i=1;i<piles.length;i++){
            high = Math.max(high, piles[i]);
        }
        while(low<=high){
            int mid = low + ((high-low)/2);
            if(hours(mid, piles) <= h)
            high = mid-1;
            else
            low = mid+1;
        }
        return low;
    }
}
