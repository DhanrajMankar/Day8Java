package Day8Java;
import java.util.*;

public class GeometryComparison extends LengthCal{

	public static void main(String[] args) {
		/*
		 * Creating an object class 
		 * */
		Scanner sc = new Scanner(System.in);
		Co_ordinates co = new Co_ordinates();
		GeometryComparison ob1=new GeometryComparison();
		
		System.out.println("Pls Enter value of x1 : ");
		int x1 = sc.nextInt();
		// Setting x1 value
		co.setX1(x1);
		
		System.out.println("Pls Enter value of y1 : ");
		int y1 = sc.nextInt();
		// Setting y1 value
		co.setY1(y1);
		
		System.out.println("Pls Enter value of x2 : ");
		int x2 = sc.nextInt();
		// Setting x2 value
		co.setX2(x2);
		
		System.out.println("Pls Enter value of y2 : ");
		int y2 = sc.nextInt();
		// Setting y2 value
		co.setY2(y2);
		
		/*Calling a LengthCal method and passing vales using get method*/
		double result =ob1.LengthCal(co.getX1(),co.getX2(),co.getY1(),co.getY2());
        
		System.out.println("The length of line is : "+result);
	}

	@Override
	double LengthCal(int x1,int x2,int y1,int y2) {
		double l= Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
		return l;
	}

}
