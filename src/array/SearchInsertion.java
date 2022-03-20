package array;

/*给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。*/
public class SearchInsertion {
    /*暴力解法*/
    public static int method1(int arr[] , int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=target){
                return i;
            }
        }
        return arr.length;
    }

    /*二分查找方法*/
    public static int method2(int arr[] , int target){
        int left = 0 , right = arr.length-1;
        while(left<=right){
            int mid = (left + right)>>1;
            if (arr[mid]>target){
                right = mid - 1;
            }else if(arr[mid]<target){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return right+1;
    }
}
