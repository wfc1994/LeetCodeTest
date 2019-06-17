import java.util.ArrayList;

public class Solution_1021 {
    public String removeOuterParentheses(String S) {

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

        String result = "";
        for(int i=0;i<sa.length;i++){
            if(!removeindexlist.contains(i)){
                result+=sa[i];
            }
        }

        return result;
    }

//    public static void main(String[] args){
//        String s = "()()";
//        Solution_1021 solution = new Solution_1021();
//        solution.removeOuterParentheses(s);
//
//    }
}
