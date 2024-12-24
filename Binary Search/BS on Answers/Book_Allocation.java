import java.util.ArrayList;

public class Book_Allocation {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n)
        return -1;
        int low = arr.get(0);
        int high = arr.get(0);
        for(int i=1;i<arr.size();i++){
            low = Math.max(low, arr.get(i).intValue());
            high = high + arr.get(i).intValue();
        }
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(students(arr,mid) <= m)
            high = mid-1;
            else
            low = mid+1;
        }
        return low;
    }
    private static int students(ArrayList<Integer> arr, int maxPages){
        int students = 0;
        int sum = 0;
        for(int i=0;i<arr.size();i++){
            sum = sum + arr.get(i).intValue();
            if(sum > maxPages){
                sum = arr.get(i).intValue();
                students++;
            }
        }
        if(sum>0)
        students++;
        return students;
    }
}
