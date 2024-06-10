class naive {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+nums[k];
                }
                maxsum=Math.max(maxsum,sum);
                sum=0;
            } 
        }
        return maxsum;
    }
}
//awful solution, takes time complexity 0(n^3)! Can use divide and conquer for this one to better the complexity.
