class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i;
        int maxCount=0,intialCount=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                intialCount++;
                if(intialCount > maxCount)
                 {
                    maxCount++;
                 }
            }
            else{
                intialCount=0;
            }
        }
        return maxCount;
        
    }
}