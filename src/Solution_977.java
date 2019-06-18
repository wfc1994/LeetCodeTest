import java.util.LinkedList;

public class Solution_977 {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        LinkedList<Integer> s = new LinkedList();
        LinkedList<Integer> p = new LinkedList();

        for(int i=0;i<A.length;i++){
            if(A[i]>=0){
                s.add(A[i]);
            }else {
                p.add(A[i]);
            }
        }
        int temp = 0;

        if(s.size()==0){
            temp = -p.getLast();
            s.add(temp);
        }


        int index = 0;
        while (p.size()!=0){
            temp = -p.getLast();
            for(int i=index;i<s.size();i++){
                if(temp<s.get(i)){
                    s.add(i,temp);
                    index = i;
                    break;
                }
            }
            p.removeLast();
        }

        for(int i=0;i<s.size();i++){
            result[i] = s.get(i)*s.get(i);
            System.out.println(result[i]);
        }

        return result;
    }

    public static void main(String[] args){
        int[] A = {-2,-1};
        Solution_977 solution = new Solution_977();
        solution.sortedSquares(A);

    }
}
