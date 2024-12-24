public class Median_of_Sorted_Arrays {
    public double bruteForce(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] ls = new int[m+n];
        int l = 0;
        int r = 0;
        int i = 0;
        while(l<m && r<n){
            if(nums1[l]<=nums2[r]){
                ls[i++] = nums1[l];
                l++;
            }else{
                ls[i++] = nums2[r];
                r++;
            }
        }
        while(l<m){
            ls[i++] = nums1[l];
            l++;
        }
        while(r<n){
            ls[i++] = nums2[r];
            r++;
        }
        if((m+n)%2 == 1)
        return (double)ls[(m+n)/2];
        return (ls[(m+n)/2] + ls[((m+n)/2)-1])/2.0;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)
        return findMedianSortedArrays(nums2, nums1);
        int low = 0;
        int high = nums1.length;
        int req = (nums1.length + nums2.length + 1)/2;
        while(low<=high){
            int mid1 = low + ((high-low)/2);
            int mid2 = req - mid1;
            int r1 = mid1<nums1.length ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = mid2<nums2.length ? nums2[mid2] : Integer.MAX_VALUE;
            int l1 = mid1-1>=0 ? nums1[mid1-1] : Integer.MIN_VALUE;
            int l2 = mid2-1>=0 ? nums2[mid2-1] : Integer.MIN_VALUE;
            if(l1<=r2 && l2<=r1){
                if((nums1.length + nums2.length)%2 == 0)
                return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                return Math.max(l1,l2);
            }
            else if(l2>r1)
            low = mid1+1;
            else
            high = mid1-1;
        }
        return (int)-1e9;
    }
}
