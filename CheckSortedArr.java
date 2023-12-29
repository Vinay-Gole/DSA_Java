public class CheckSortedArr {
  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 6, 4, 8, 9 };
    System.out.println(isSorted(arr));
  }
  static boolean isSorted(int arr[]){
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      if (arr[i] >= arr[i - 1]) {
       
      } else {
        return false;
      }
    }
    return false;
  }

}
