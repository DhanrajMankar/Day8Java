package Day8Java;
import java.util.*;

public class GeometryComparison extends LengthCal{

	public static void main(String[] args) {
		/*
		 * Creating an object class 
		 * */
		Scanner sc = new Scanner(System.in);
		Co_Ordinates line1 = new Co_Ordinates();
		Co_Ordinates line2 = new Co_Ordinates();
		GeometryComparison ob1=new GeometryComparison();
		
		
		System.out.println("For line1 pls enter the values");
		System.out.println("Pls Enter value of x1 : ");
		int x1 = sc.nextInt();
		// Setting x1 value
		line1.setX1(x1);
		
		System.out.println("Pls Enter value of y1 : ");
		int y1 = sc.nextInt();
		// Setting y1 value
		line1.setY1(y1);
		
		System.out.println("Pls Enter value of x2 : ");
		int x2 = sc.nextInt();
		// Setting x2 value
		line1.setX2(x2);
		
		System.out.println("Pls Enter value of y2 : ");
		int y2 = sc.nextInt();
		// Setting y2 value
		line1.setY2(y2);
		
		/*Calling a LengthCal method and passing vales using get method*/
		double Line1length =ob1.LengthCal(line1.getX1(),line1.getX2(),line1.getY1(),line1.getY2());
        
		System.out.println("For line2 pls enter the values");
		
		
		System.out.println("Pls Enter value of x1 : ");
		 x1 = sc.nextInt();
		// Setting x1 value
		line2.setX1(x1);
		
		System.out.println("Pls Enter value of y1 : ");
		y1 = sc.nextInt();
		// Setting y1 value
		line2.setY1(y1);
		
		System.out.println("Pls Enter value of x2 : ");
		x2 = sc.nextInt();
		// Setting x2 value
		line2.setX2(x2);
		
		System.out.println("Pls Enter value of y2 : ");
		y2 = sc.nextInt();
		// Setting y2 value
		line2.setY2(y2);
		
		/*Calling a LengthCal method and passing vales using get method*/
		double Line2length =ob1.LengthCal(line2.getX1(),line2.getX2(),line2.getY1(),line2.getY2());
		
		if(Line1length==Line2length)
		{
			System.out.println("Both lines are of same length");	
		}
		else
		{
			System.out.println("Both lines are NOT same length");		
		}
	}

	@Override
	double LengthCal(int x1,int x2,int y1,int y2) {
		double l= Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
		return l;
	}

}
