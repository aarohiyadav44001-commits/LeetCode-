class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i]; 
        }
        int max = sum;
        for(int i=1; i<=nums.length-k;i++){
            sum = sum - nums[i-1] + nums[i + k -1];
        
        if(max < sum){
            max = sum;
        }
} 
        return (double) max/k;  
    }
}
