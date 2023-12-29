package StringQuestions;

public class PalindromStr {
  public static void main(String[] args) {
    
    String str = "Level";
    String revstr = "";
    
    for (int i = str.length() - 1; i >= 0; i--) {
      revstr += str.charAt(i);
    }
    if (str.toLowerCase().equals(revstr.toLowerCase()) ) {
      System.out.println("YES IT IS PALINDROME!!!");
    } else {
      System.out.println("NOT PALINDROME!!");
    }
  }
}
