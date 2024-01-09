package BinarySearch;

public class OrderAgnosticBS {
  public static void main(String[] args) {
    // int arr[] = { 40, 20, 10, 5, 2, 6 };
    int arr[]={2,4,5,6,7,8,9};
    System.out.println(orderAgnosticBs(arr, 9));
  }

  static int orderAgnosticBs(int arr[], int tar) {
    
    int start = 0;
    int end = arr.length-1;
    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] == tar) {
        return mid;
      }
      if (isAsc) {
        if (tar < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (tar > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }
}
