class Solution {
    //at that postion left, right will contain all product except that position's, so just multiplying them you get resultant array
    public int[] productExceptSelf(int[] nums) {
        int left[]=new int[nums.length];
        int right[]= new int[nums.length];
        int res[]= new int[nums.length];
        left[0]=1;
        for(int i=1;i<left.length;i++) {
            left[i]=left[i-1]*nums[i-1];
        }
        right[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--) {
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++) {
            res[i]=left[i]*right[i];
        }
        return res;

    }
}