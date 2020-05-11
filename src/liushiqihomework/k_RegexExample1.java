package liushiqihomework;

import java.util.regex.*;

public class k_RegexExample1{
   public static void main(String args[]){
      String content = "I am noob " +
        "from runoob.com.";
 
      String pattern = ".*bat.*";
 
      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("字符串中是否包含了 'bat' 子字符串? " + isMatch);
   }
}
