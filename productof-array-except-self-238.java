class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        answer[0]=1;
        for(int i=1;i<nums.length;i++){
            answer[i]=answer[i-1]*nums[i-1];
        }
        int right=1;
        for(int j=nums.length-2;j>=0;j--){
            right*=nums[j+1];
            answer[j]=right*answer[j];
        }  
      return answer;  
    }
}
