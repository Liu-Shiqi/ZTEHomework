package liushiqihomework;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class l_data {

		public static void main(String []args) {
			  System.out.println("请输入日期，格式xxxx-xx-xx");
			  Scanner sc = new Scanner(System.in); 
			  String date_str = sc.nextLine();
			  sc.close();
			  Pattern p=Pattern.compile("(\\d{4})-(\\d{1,2})-(\\d{1,2})");  
			  Matcher m=p.matcher(date_str);  

			  if(m.find()){  
			   System.out.println(m.group(3)+"-"+m.group(2)+"-"+m.group(1));  
			  }  
			    }

	}


