class Solution {
    public int secondLargestElement(int[] nums) {
       int max1=nums[0],max2=Integer.MIN_VALUE,i;
       for(i=0;i<nums.length;i++)
       {
        if(nums[i]>max1)
        {
            max2=max1;
            max1=nums[i];
        }
     
     else if(nums[i]>max2 && nums[i]<max1)
            max2 = nums[i];

       
    }
    if(max2==Integer.MIN_VALUE)
    {
        return -1;
    }
return max2;
   }
  
    
}

