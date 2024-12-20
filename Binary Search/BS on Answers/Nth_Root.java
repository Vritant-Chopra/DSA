public class Nth_Root {
    public int nthRoot(int n, int m) {
        // code here
        int low = 1;
        int high = m;
        while(low<=high){
            int mid = low + ((high-low)/2);
            int answer = answer(mid,n);
            if(answer == m)
            return mid;
            else if(answer < m)
            low = mid+1;
            else
            high = mid-1;
        }
        return -1;
    }
    public int answer(int mid, int n){
        int answer = 1;
        for(int i=0;i<n;i++){
            answer = answer * mid;
        }
        return answer;
    }
}
