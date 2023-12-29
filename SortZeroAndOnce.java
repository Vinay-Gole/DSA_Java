public class SortZeroAndOnce {
  public static void main(String[] args) {
    int arr[] = { 1, 0, 1, 1, 0, 1, 0, 0, 1 };
    sortZeroandOne(arr);
    printArray(arr);

  }

  static void printArray(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }

  static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i]=arr[j];
    arr[j] = temp;
  }

  static void sortZeroandOne(int arr[]){
    int n=arr.length;
    int left=0;
    int right=n-1;
    while (left < right){
      if (arr[left] == 1 && arr[right] == 0) {
        swap(arr, left, right);
        left++;
        right--;
      }
      if (arr[left] == 0) {
        left++;
      }
      if(arr[right]==1) {
        right--;
      }

    }
  }
}
