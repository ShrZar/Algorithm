package array;

public class SqrtX {
/*    public static int mySqrt(int x){
        int left = 0;
        int right = x-1;
        while(left<=right){
            int mid = (left+right)>>>1;
            if(mid*mid>x){
                right = mid - 1 ;
            }else if(mid*mid<x){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return right+1;
    }*/

    public static int mySqrt2(int x) {
        int left = 0, right = x;
        while (left < right) {
            int mid = (left + right + 1) >>> 1;
            if (mid <= x /mid) {
                // mid*mid <= x
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(mySqrt2(i));
        }

    }


}
