package liushiqihomework;

public class j_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			for(char a = 'x';a <= 'z'; a++){
			    for(char b = 'x'; b <= 'z'; b++){
			        for(char c = 'x'; c <= 'z'; c++){
			            if(a != 'x' && c!='x'&&c!='z'&&a!=b&&a!=c&&b!=c){ // 后三个条件是去除重复情况（比如排除：a vs y, b vs y）
			                System.out.println("a  vs  "+a);
			                System.out.println("b  vs  "+b);
			                System.out.println("c  vs  "+c);
			            }
			        }
			    }
			}
		}

	}

}
