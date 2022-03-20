package array;

import java.util.Arrays;

/*给定一个正整数 n，生成一个包含 1 到 $n^2$ 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。

示例:

输入: 3 输出: [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]*/
public class 螺旋矩阵 {
    public static int[][] generateMatrix(int n){
        int[][] res = new int[n][n];
        int startX=0;
        int startY=0;
        int offset = 1;
        int loop = n/2;
        int count =1;
        int mid = n/2;
        while(loop>0){
            int i = startX;
            int j = startY;
            for(;j<startY+n-offset;j++) res[i][j]=count++;
            for(;i<startX+n-offset;i++) res[i][j]=count++;
            for(;j>startY;j--) res[i][j]=count++;
            for(;i>startX;i--) res[i][j]=count++;
            loop--;
            startX+=1;
            startY+=1;
            offset+=2;
        }
        if(n%2==1){
            res[mid][mid]=n*n;
        }
        return res;
    }

    public static void main(String[] args) {
        int a[][] = generateMatrix(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

    }

}
