package liushiqihomework;

public class m_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "helloworld@sina.com";
		String[] arr = str.split(str, '@'); //两部分
		//console.log(arr);
		System.out.println("用户名："+arr[0]);
		System.out.println("域名："+arr[1]);
	}

}
