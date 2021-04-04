import java.util.ArrayList;
import java.util.List;

public class Solution_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> bins = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        int max = (int) Math.pow(2.0,len);
        for (int i = 0; i < max; i++) {
            ArrayList<Integer> binary = new ArrayList<>();
            int k=i;
            for (int j = 0; j < len; j++) {
                binary.add(k%2);
                k=k/2;
            }
            bins.add(binary);
        }

        for ( List<Integer> b :bins
             ) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < b.size(); i++) {
                if(b.get(i)==1){
                    tmp.add(nums[i]);
                }
            }
            res.add(tmp);
        }



        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        Solution_90 solution_90 = new Solution_90();
        solution_90.subsetsWithDup(nums);
    }
}
