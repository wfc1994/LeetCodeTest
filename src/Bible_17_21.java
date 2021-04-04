/**
 * 面试题 17.21. 直方图的水量
 * 给定一个直方图(也称柱状图)，假设有人从上面源源不断地倒水，最后直方图能存多少水量?直方图的宽度为 1。
 */
public class Bible_17_21 {
    public int trap(int[] height) {
        int res = 0;
        int len = height.length;
        boolean flag = true;

        while (flag){
            int[] tmp = new int[len];
            int entity = 0;
            for (int i = 0; i < height.length; i++) {
                if(height[i]>0){
                    tmp[i]=1;
                    height[i]=height[i]-1;
                    entity++;
                }
            }

            int start = 0;
            int end = 0;
            for (int i = 0; i < tmp.length; i++) {
                if(tmp[i]==1){
                    start = i;
                    break;
                }
            }
            for (int i = tmp.length-1; i >= 0; i--) {
                if(tmp[i]==1){
                    end = i;
                    break;
                }
            }
            if(end-start<=1){
                flag=false;
            }else {
                res = res+end-start+1-entity;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Bible_17_21 bible_17_21 = new Bible_17_21();
        int trap = bible_17_21.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(trap);
    }
}
