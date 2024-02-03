package classwork;

public class primtivetypecasting_narrow_widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//narrow [big to small]
		double a=90;
		int b=(int)a;
		System.out.println(b);
		//widening[small to big]
		
		int a1=90;
		double b1=a1; //implicitly
		System.out.println(b1);
		double b2=(double)a1;//explicilty
		System.out.println(b2);

	}

}
