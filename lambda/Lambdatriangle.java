interface triarea{
	double triangleArea(double b,double h);
}


public class Triangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triarea t1 = (double b,double h)->(0.5*b*h);
		System.out.print(t1.triangleArea(4, 5));
	}
}
