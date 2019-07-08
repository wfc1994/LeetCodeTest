public class Solution_861 {
    public int matrixScore(int[][] A) {
        int line = A.length;
        int row = A[0].length;
        int reverse = 0;
        int linetotal = 0;
        int linetemptotal = 0;
        int result = 0;

        //	按照行转置
        for(int i=0;i<line;i++) {
            linetotal = 0;
            linetemptotal = 0;
            for(int j=0;j<row;j++) {
                if(A[i][j]==0) {
                    reverse = 1;
                }else {
                    reverse = 0;
                }

                //	计算2的n次方
                int s=1;
                for(int k=row-j-1;k>0;k--) {
                    s = s * 2;
                }

                linetotal = linetotal + A[i][j]*s;
                linetemptotal = linetemptotal + reverse*s;
            }

            if(linetemptotal>linetotal) {
                for(int j=0;j<row;j++) {
                    if(A[i][j]==0) {
                        A[i][j] = 1;
                    }else {
                        A[i][j] = 0;
                    }
                }
            }

        }



        //	遍历一列数组，如果比原数二进制大的话，那就翻转一列
        for(int i=0;i<row;i++) {
            linetotal = 0;
            linetemptotal = 0;

            for(int j=0;j<line;j++) {

                if(A[j][i]==0) {
                    reverse = 1;
                }else {
                    reverse = 0;
                }

                linetotal = linetotal + A[j][i];
                linetemptotal = linetemptotal + reverse;

            }

            if(linetemptotal>linetotal) {
                for(int j=0;j<line;j++) {
                    if(A[j][i]==0) {
                        A[j][i] = 1;
                    }else {
                        A[j][i] = 0;
                    }
                }
            }
        }


        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[0].length;j++) {
                int s=1;
                for(int k=row-j-1;k>0;k--) {
                    s = s * 2;
                }
                result = result + A[i][j]*s;
            }
        }


        return result;
    }
}
