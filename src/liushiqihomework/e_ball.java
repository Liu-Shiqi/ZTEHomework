package liushiqihomework;

public class e_ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height=100;
		double bounce=0;
		double sum=height;
		for(int i=2;i<=10;i++) {
			bounce=height/2;
			sum=sum+bounce*2;
			height=bounce;
			
		}
		System.out.println("��ʮ�����ʱС���ߵľ���Ϊ"+sum);
		System.out.println("��ʮ�η����߶�Ϊ"+bounce/2);
		

	}

}
