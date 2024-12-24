public class kth_Element_of_Sorted_Arrays {
    //similar to median of sorted arrays. only division and search space changes.
    public int kthElement(int a[], int b[], int k) {
        // code here
        int m = a.length;
        int n = b.length;
        if(m>n)
        return kthElement(b,a,k);
        int low = (int)Math.max(0,k-n);
        int high = (int)Math.min(k,m);
        int req = k;
        while(low<=high){
            int mid1 = low + ((high-low)/2);
            int mid2 = req-mid1;
            int r1 = mid1<m ? a[mid1] : Integer.MAX_VALUE;
            int r2 = mid2<n ? b[mid2] : Integer.MAX_VALUE;
            int l1 = mid1-1>=0 ? a[mid1-1] : Integer.MIN_VALUE;
            int l2 = mid2-1>=0 ? b[mid2-1] : Integer.MIN_VALUE;
            if(l1<=r2 && l2<=r1){
                if((m+n)%2 == 1)
                return (int)Math.max(l1,l2);
                return (int)Math.max(l1,l2);
            }else if(l1>r2)
            high = mid1-1;
            else
            low = mid1+1;
        }
        return -1;
    }
}
