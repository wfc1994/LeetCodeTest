public class Solution_1021 {
    public String removeOuterParentheses(String S) {
//        while(S.contains("()")){
//
//        }
        System.out.println(S.indexOf("()"));
        char [] sa = S.toCharArray();
        for(int i=0;i<sa.length;i++){
            if(sa[i]=='('&&sa[i+1]==')'){
                sa[i]='0';
                sa[i+1]='0';
            }

        }
        for(int i=0;i<sa.length;i++){
            System.out.print(sa[i]+" ");
        }
        return null;
    }

    public static void main(String[] args){
        String s = "(()())(())(()(()))";
        Solution_1021 solution = new Solution_1021();
        solution.removeOuterParentheses(s);

    }
}
