package liushiqihomework;

import java.util.regex.*;

public class k_RegexExample1{
   public static void main(String args[]){
      String content = "I am noob " +
        "from runoob.com.";
 
      String pattern = ".*bat.*";
 
      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("�ַ������Ƿ������ 'bat' ���ַ���? " + isMatch);
   }
}
