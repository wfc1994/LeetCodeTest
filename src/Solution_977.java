import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution_977 {
    public int[] sortedSquares(int[] A) {
        //找到两个大于等于0的第一个位置和小于等于0的位置
        int pindex = 0;
        int nindex = 0;
        int[] result = new int[A.length];
        for(int i=0;i<A.length;i++){
            if(A[i]>=0){//找到临界位置
                pindex = i;
                nindex = i-1;
                break;
            }
        }

        if(nindex==-1){
            for(int i=0;i<A.length;i++){
                result[i] = A[i] * A[i];
            }
        }else if(pindex==nindex){
            int count = 0;
            for(int i=A.length-1;i>=0;i--){
                result[count] = A[i] * A[i];
                count++;
            }
        }else {
            int count=0;
            while (true){
                //循环终止两个条件，要么pindex到末尾，要么nindex到0位
                if(nindex<0){
                    while(pindex<=A.length-1){
                        System.out.println(pindex);
                        result[count] = A[pindex]*A[pindex];
                        count++;
                        pindex++;
                    }
                    break;
                }
                if(pindex>A.length-1){
                    while(nindex>=0){
                        System.out.println(nindex);
                        result[count] = A[nindex]*A[nindex];
                        count++;
                        nindex--;
                    }
                    break;
                }

                if(-A[nindex]<A[pindex]){
                    System.out.println(nindex);
                    result[count] = A[nindex]*A[nindex];
                    count++;
                    nindex--;
                }else{
                    System.out.println(pindex);
                    result[count] = A[pindex]*A[pindex];
                    count++;
                    pindex++;
                }


            }
        }

//        for(int i=0;i<result.length;i++){
//            System.out.print(result[i]+" ");
//        }

        return result;
    }

//    public static void main(String[] args){
//        int[] A = {3,4};
//        Solution_977 solution = new Solution_977();
//        solution.sortedSquares(A);
//
//    }
}
