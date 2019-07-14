public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

//    public static void main(String[] args){
//        Solution_1 solution_1 = new Solution_1();
//        int[] nums = {2,7,11,15};
//        solution_1.twoSum(nums,9);
//    }
}
