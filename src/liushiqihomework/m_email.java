package liushiqihomework;

public class m_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "helloworld@sina.com";
		String[] arr = str.split(str, '@'); //������
		//console.log(arr);
		System.out.println("�û�����"+arr[0]);
		System.out.println("������"+arr[1]);
	}

}
