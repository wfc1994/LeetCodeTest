public class Solution_977_1 {
    public int[] sortedSquares(int[] A) {
        int res[]=new int[A.length];
        int count=A.length-1;
        int right=A.length-1;
        int left=0;
        while(left<=right){
            if(A[left]*A[left]<=A[right]*A[right]){
                res[count]=A[right]*A[right];
                right--;
                count--;
            }else{
                res[count]=A[left]*A[left];
                left++;
                count--;
            }
        }
        return res;
    }

//    public static void main(String[] args){
//        int[] A = {3,4};
//        Solution_977_1 solution = new Solution_977_1();
//        solution.sortedSquares(A);
//
//    }
}
