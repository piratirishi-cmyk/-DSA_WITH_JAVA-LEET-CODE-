public class largestElement {
    public int largestElement(int[] nums) {
     int max=nums[0],i;
        for(i=0;i<nums.length;i++)
    {
        if(nums[i]>max)
        {
            max = nums[i];
           
        }
    }
   
 return max;    
    }

    
}
