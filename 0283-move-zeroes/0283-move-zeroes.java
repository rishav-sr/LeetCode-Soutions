class Solution {
    public void moveZeroes(int[] nums) {
        int counter=0;
        for(int n:nums) {
            if(n!=0)
            {
                nums[counter++]=n;
            }
        }
        for(int i=counter;i<nums.length;i++){
            nums[i]=0;
        }
    }
}