class better {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=0;

            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                maxsum=Math.max(maxsum,sum);
            } 
        }
        return maxsum;
        
    }
}  
//uses 0(n^2)
