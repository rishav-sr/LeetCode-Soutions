class Solution {
    //use counter variable to move all non zero to left side.. and then append 0 at the end
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