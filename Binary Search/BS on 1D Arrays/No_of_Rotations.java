import java.util.List;

public class No_of_Rotations {
    //basically find the min element index
    public int findKRotation(List<Integer> arr) {
        // Code here
        return findMin(arr);
    }
    public int findMin(List<Integer> nums) {
        int low = 0;
        int high = nums.size()-1;
        int min = nums.get(low).intValue();
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(nums.get(low).intValue()<=nums.get(mid).intValue()){
                //left half sorted
                min = Math.min(min,nums.get(low).intValue());
                low = mid+1;
            }
            else{
                //right half sorted
                min = Math.min(min,nums.get(mid).intValue());
                high = mid-1;
            }
        }
        return nums.indexOf(min);
    }
}
