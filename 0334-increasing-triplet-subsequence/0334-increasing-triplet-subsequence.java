class Solution {
    public boolean increasingTriplet(int[] nums) {
        int l=nums.length;
        int min[]= new int[l];
        int max[]= new int[l];
        min[0]=nums[0];max[l-1]=nums[l-1];
        for(int i=1;i<l;i++) {
            if(nums[i]>min[i-1]) {
                min[i]=min[i-1];
            }
            else
            min[i]=nums[i];
            
            if(max[l-i]>nums[l-i-1])
            max[l-i-1]=max[l-i];
            else
            max[l-i-1]=nums[l-i-1];
        }
        for(int i=0;i<l;i++) {
            if(nums[i]>min[i] && nums[i]<max[i])
            return true;
        }
        return false;
    }
    //  public static boolean increasingTriplet(int[] nums) {
    //     int first = Integer.MAX_VALUE;
    //     int second = Integer.MAX_VALUE;

    //     for (int cur : nums) {
    //         if (cur <= first) {
    //             first = cur;
    //         } else if (cur <= second) {
    //             second = cur;
    //         } else {
    //             return true;
    //         }
    //     }

    //     return false;
    // }
}