package Sort;

public class HeapSort {
    public static void maxHeapify(int arr[], int index, int heapSize) {
        int largeIndex = index;
        if ((index * 2 + 1) < heapSize && arr[index * 2 + 1] > arr[largeIndex]) {
            largeIndex = index * 2 + 1;
        }

        if ((index * 2 + 2) < heapSize && arr[index * 2 + 2] > arr[largeIndex]) {
            largeIndex = index * 2 + 2;
        }

        if (largeIndex != index) {
            swap(arr, index, largeIndex);
            maxHeapify(arr, largeIndex, heapSize);
        }

    }

    public static void buildMaxHeap(int[] arr) {
        int heapSize = arr.length;
        for (int i = (arr.length - 2) / 2; i > -1; i--) {
            maxHeapify(arr, i, heapSize);
        }
    }

    public static void heapSort(int arr[]) {
        buildMaxHeap(arr);
        int heapSize = arr.length;
        for (int i = heapSize - 1; i > 0; i--) {
            swap(arr, 0, i);
            maxHeapify(arr, 0, i);
        }
    }


    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] test = {4, 3, 9, 5, 10, 2, 6};
        heapSort(test);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
    }
}







