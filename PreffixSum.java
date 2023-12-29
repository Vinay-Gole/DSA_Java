public class PreffixSum {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5 };
    // int ans[] = preffixSum(nums);
    int ans[] = suffixSum(nums);
      printArray(ans);

  }

  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  
  static int []  preffixSum(int arr[]){
   int n=arr.length;
int i=1;
   while (i<n) {
    arr[i]=arr[i]+arr[i-1];
    i++;
   }
   return arr;

// for (int i = 1; i < n; i++) {
//   arr[i] = arr[i] + arr[i - 1];
// }
// return arr;

  }

  static int[] suffixSum(int arr[]) {
    int n = arr.length;
    
    for (int i = n - 2; i >= 0; i--) {
      arr[i] += arr[i + 1];
    }
    return arr;
  }
}
