import java.util.Scanner;

public class PreffixSum {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5 };
    // int ans[] = preffixSum(nums);
    // int ans[] = suffixSum(nums);
    // printArray(ans);
    rangeQuerySum(nums);

  }
  
  static void rangeQuerySum(int nums[]) {
     Scanner sc= new Scanner(System.in);
      System.out.print("Enter the value of Q:");
      int q = sc.nextInt();
      int prefix[] = preffixSum(nums);
      
      while (q-- > 0) {
        System.out.print("enter the value of L:");
        int l = sc.nextInt();
        System.out.print("enter the value of R:");
        int r = sc.nextInt();
        
        if (r > nums.length || l>nums.length) {
          System.out.println("Invalid input Out of range !!");
          return;
        }
        int ans = prefix[r] - prefix[l - 1];
        System.out.print("Sum of Range is " + ans);
        System.out.println();
        
      }

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
