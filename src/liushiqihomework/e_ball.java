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
		System.out.println("第十次落地时小球走的距离为"+sum);
		System.out.println("第十次反弹高度为"+bounce/2);
		

	}

}
