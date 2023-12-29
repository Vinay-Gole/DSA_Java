import java.util.Scanner;

public class FrequencyArray {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 2, 2, 3, 4, 5, 6, 8, 9, 6 };
    
    int ans[] = frequencyArray(arr);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Query :");
    int q = sc.nextInt();
    while (q-->0) {
      
      System.out.println("Enter array Element to be searched:");
      int x=sc.nextInt();
      if(ans[x]>0){
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }

  }

  static int[] frequencyArray(int arr[]) {
    int freq[] = new int[10005];

    for (int i = 0; i < arr.length; i++) {
      freq[arr[i]]++;
    }
    return freq;
  }
  
}
