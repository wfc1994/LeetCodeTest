public class Solution_1051 {
    public int heightChecker(int[] heights) {
        int[] oheights = new int[heights.length];
        for (int i=0;i<heights.length;i++){
            oheights[i] = heights[i];
        }

        int temp = 0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]>heights[j]){
                    temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }

        int count = 0;
        for (int i=0;i<heights.length;i++){
            if(heights[i]!=oheights[i]){
                count++;
            }
        }

        return count;
    }

//    public static void main(String[] args){
//        Solution_1051 s = new Solution_1051();
//        int[] test = {1,1,4,2,1,3};
//        s.heightChecker(test);
//    }
}
