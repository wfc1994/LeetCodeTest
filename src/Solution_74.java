/**
 * 74. 搜索二维矩阵
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 *
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-a-2d-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

//思路是对的，然后在加上二分法，先选列，再选行
public class Solution_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if(target==matrix[i][matrix[0].length-1]){
                return true;
            }

            if(target<matrix[i][matrix[0].length-1]){
                for (int j = 0; j < matrix[i].length; j++) {
                    if(target==matrix[i][j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
