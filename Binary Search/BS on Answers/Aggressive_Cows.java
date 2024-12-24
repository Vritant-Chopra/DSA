import java.util.Arrays;

public class Aggressive_Cows {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length-1] - stalls[0];
        while(low<=high){
            int mid = low + ((high-low)/2);
            if(isPossible(mid,stalls,k))
            low = mid+1;
            else
            high = mid-1;
        }
        return high;
    }
    private static boolean isPossible(int minDistance, int[] stalls, int k){
        int cows = 1;
        int last_Index = 0;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-stalls[last_Index] >= minDistance){
                cows++;
                last_Index = i;
            }
            if(cows==k)
            return true;
        }
        return false;
    }
}
