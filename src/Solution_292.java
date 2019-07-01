public class Solution_292 {
    public boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }else{
            return true;
        }
    }

//    public static void main(String[] args){
//        Solution_292 s = new Solution_292();
//        boolean flag = s.canWinNim(1049);
//        System.out.println(flag);
//    }
}
