public class Solution_781 {
    public int numRabbits(int[] answers) {
        int[] tmp = new int[1000];
        int res = 0;
        if(answers==null){
            return  res;
        }
        for (int i = 0; i < answers.length; i++) {
            int index = answers[i];
            tmp[index]++;
        }
        res = tmp[0];
        for (int i = 1; i < tmp.length; i++) {
            if(tmp[i]!=0){
                int t1 = tmp[i] / (i + 1);
                int t2 = tmp[i] % (i + 1);
                res = res + t1*(i+1);
                if(t2>0){
                    res = res + i + 1;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution_781 solution_781 = new Solution_781();
        int i = solution_781.numRabbits(new int[]{0,0,0,0,0});
        System.out.println(i);
    }
}
