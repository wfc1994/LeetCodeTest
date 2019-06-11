import java.util.ArrayList;

public class Solution_1021 {
    public String removeOuterParentheses(String S) {
//        while(S.contains("()")){
//
//        }
        System.out.println(S.indexOf("()"));
        char [] sa = S.toCharArray();
        int [] san = new int[sa.length];
        for(int i=0;i<sa.length;i++){
            if(sa[i]=='('){
                san[i]=-1;
            }
            if(sa[i]==')'){
                san[i]=1;
            }

        }
        for(int i=0;i<san.length;i++){
            System.out.print(sa[i]+" ");
        }
        System.out.println();
        for(int i=0;i<san.length;i++){
            System.out.print(san[i]+" ");
        }

        int sum=0;
        ArrayList<Integer> removeindexlist = new ArrayList<>();
        for(int i=0;i<san.length;i++){
            sum = sum + san[i];
            if(sum==0){
                removeindexlist.add(i);
            }
        }
        for(int i=san.length-1;i>=0;i--){
            sum = sum + san[i];
            if(sum==0){
                removeindexlist.add(i);
            }
        }
        System.out.println();
        for(int i: removeindexlist){
            System.out.print(i+" ");
        }
        return null;
    }

    public static void main(String[] args){
        String s = "(()())(())(()(()))";
        Solution_1021 solution = new Solution_1021();
        solution.removeOuterParentheses(s);

    }
}
