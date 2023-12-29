public class SortByParity {
  public static void main(String[] args) {
    int nums[] = { 2, 5, 3, 5, 56, 1, 2, 1, 34, 4, 44 };
    sortArrayByParity(nums);
    printArray(nums);
  }

  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  static void sortArrayByParity(int[] arr){
    int n = arr.length;

    int left = 0, right = n-1;

    while (left < right){
        if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
            swap(arr, left, right);
            left++;
            right--;
        }

        if(arr[left] % 2 == 0){
            left++;
        }

        if(arr[right] % 2 == 1){
            right--;
        }
    }
}
}
