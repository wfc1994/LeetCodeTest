
public class Solution_1021_1 {
    public String removeOuterParentheses(String S) {

        StringBuilder result = new StringBuilder();
        int count = 0;
        char[] inputs = S.toCharArray();
        for (int i = 0; i < inputs.length; i++) {
            char currentChar = inputs[i];
            if (currentChar == '(') {
                if (count++ > 0) result.append(currentChar);
            } else {
                if (--count > 0) result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        String s = "(())()";
        Solution_1021_1 solution = new Solution_1021_1();
        solution.removeOuterParentheses(s);

    }
}
