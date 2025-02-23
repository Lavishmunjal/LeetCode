// package ;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int leftmost = findLeftmost(nums, target, n);
        int rightmost = findRightmost(nums, target, n);
        return new int[]{leftmost, rightmost};
    }
    public int findLeftmost(int[] nums, int target, int n) {
        int l=0, r=n-1;
        int leftmost=-1;
        while(l<=r) {
            int mid = l + (r-l)/2;
            if(nums[mid]==target) {
                leftmost=mid;
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else {
                r=mid-1;
            }

        }
        return leftmost;
    }

    public int findRightmost(int[] nums, int target, int n) {
        int l=0, r=n-1;
        int rightmost=-1;
        while(l<=r) {
            int mid = l + (r-l)/2;
            if(nums[mid]==target) {
                rightmost=mid;
                l=mid+1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else {
                r=mid-1;
            }

        }
        return rightmost;
    }
    
}
