class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int[] left=new int[nums.length];
        left[0]=nums[0];
        int[] right=new int[nums.length];
        right[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<=nums.length-1;i++){
            left[i]=left[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i];
        }
        for(int i=0;i<=nums.length-1;i++){
            if(i==0){
                answer[i]=right[i+1];

            }
            else if(i==nums.length-1){
                answer[i]=left[i-1];
            }
            else{
            answer[i]=left[i-1]*right[i+1];
            }
            
        }
        return answer;  ///can better memory optimization here by storing either the right products or the left products in a variable instead of an array--let me see
    }
}
