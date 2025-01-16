class xorAllNums {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(xorAllNums(nums1, nums2));
    }
    public static int  xorAllNums(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int xor =0;
        if(m%2!=0){
            for(int num:nums2){
                xor^=num;
            }
        }
        if(n%2!=0){
            for(int num:nums1){
                xor^=num;
            }
        }
        return xor;
    }
}

//Approach 2

class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m = nums2.length;
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int num:nums1){
        map.put(num, map.getOrDefault(num, 0)+m);
       }
       for(int num:nums2){
        map.put(num, map.getOrDefault(num, 0)+n);
       }
       int result =0;
       for(int num:map.keySet()){
            if(map.get(num)%2!=0){
                result ^=num;
            }
       }
       return result;
    }
}