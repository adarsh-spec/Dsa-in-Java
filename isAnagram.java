import java.util.*;

class darsh{
static boolean isAnagram(String s1, String s2){
  
   char[] s11=s1.toCharArray();
    char[] s22=s2.toCharArray();
    
    Arrays.sort(s11);
    Arrays.sort(s22);
    
    return Arrays.equals(s11,s22);
   
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      
      String s1="silent";
      String s2="listen";
      System.out.println(isAnagram(s1,s2));
      
     
      
  }
}
}
