import java.util.HashMap;
import java.util.Map;

public class Solution_1_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("没有答案");
    }

    public static void main(String[] args){
        Solution_1_1 solution_1 = new Solution_1_1();
        int[] nums = {3,3};
        solution_1.twoSum(nums,6);
    }
}
