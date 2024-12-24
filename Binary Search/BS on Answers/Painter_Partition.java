import java.util.ArrayList;

public class Painter_Partition {
    //special case of book allocation problem
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        return helper(boards, k);
    }
    private static int helper(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int low = arr.get(0);
        int high = arr.get(0);
        for(int i=1;i<arr.size();i++){
            low = Math.max(low, arr.get(i).intValue());
            high = high + arr.get(i).intValue();
        }
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(painters(arr,mid) <= k)
            high = mid-1;
            else
            low = mid+1;
        }
        return low;
    }
    private static int painters(ArrayList<Integer> arr, int maxArea){
        int painters = 0;
        int sum = 0;
        for(int i=0;i<arr.size();i++){
            sum = sum + arr.get(i).intValue();
            if(sum > maxArea){
                sum = arr.get(i).intValue();
                painters++;
            }
        }
        if(sum>0)
        painters++;
        return painters;
    }
}
