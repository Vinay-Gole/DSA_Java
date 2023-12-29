/**
 * ArrayRotate
 */
public class ArrayRotate {

  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5, 6 };
    int k = 3;
    rotateArrayByk(nums, k);
    printArray(nums);
  }
   
  static void printArray(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }

  static void reverse(int arr[], int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start++] = arr[end];
      arr[end--]=temp;      
    }
  }

  static void rotateArrayByk(int arr[],int k){
    int n = arr.length;
    k = k % n;
    int start=0;
    int end=n-1;
    reverse(arr, start, k - 1);
    reverse(arr, k, end);
    reverse(arr, 0, end);
  }
}

