package array;

/*给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。*/

public class RemoveOneValue {
    /*暴力解法*/
   /* public static int removeSimple1(int arr[] , int target){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target){
                for (int j = i+1; j < size; j++) {
                    arr[j-1] = arr[j];
                }
                i--;
                size--;
            }
        }
        return size;
}*/





    /*快慢指针法*/
    public static int remove(int arr[] , int target){
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=target){
                arr[k++]=arr[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,3,3,3,3,4,5,6,4,7,8,9,34,5612,2,4};
        System.out.println(arr.length);
        System.out.println(remove(arr,2));
    }

}

