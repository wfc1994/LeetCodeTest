public class Solution_1109_1 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        int l, r, seat;
        for (int i = 0; i < bookings.length; i++) {
            l = bookings[i][0] - 1;
            r = bookings[i][1] - 1;
            seat = bookings[i][2];

            res[l] += seat;
            if(r < n - 1) {
                res[r + 1] -= seat;
            }
        }

        for (int i = 1; i < n; i++) {
            res[i] += res[i - 1];
        }
        return res;
    }

//    public static void main(String[] args){
//        Solution_1109_1 solution_1109 = new Solution_1109_1();
//        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
//        solution_1109.corpFlightBookings(bookings,5);
//    }
}
