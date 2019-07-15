import java.util.ArrayList;
import java.util.List;

public class Solution_22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }

//    public static void main(String[] args){
//        Solution_22 solution_22 = new Solution_22();
//
//        List<String> r = solution_22.generateParenthesis(3);
//        System.out.println(r);
//    }

}
