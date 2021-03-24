import java.util.*;
public class LineComparisonProgram
{
	//Calculating Length of line
	public static double lineLength(double x1, double y1, double x2, double y2)
	{
		double length_of_line = 0;

		if(x2 > x1 && y2 > y1) //For keeping the value positive inside 'sqrt' method
		{
			length_of_line = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		}
		if(x1 > x2 && y1 > y2)
		{
			length_of_line = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		}
		if(x2 > x1 && y1 > y2)
		{
			length_of_line = Math.sqrt((x2-x1)*(x2-x1)+(y1-y2)*(y1-y2));
		}
		else
		{
			length_of_line = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		}
		return length_of_line;
	}

	public static void main(String[] args)
	{
		//Taking the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X1 co-ordinate: ");
		double X1 = sc.nextDouble();
		System.out.println("Enter Y1 co-ordinate: ");
		double Y1 = sc.nextDouble();
		System.out.println("Enter X2 co-ordinate: ");
		double X2 = sc.nextDouble();
		System.out.println("Enter Y2 co-ordinate: ");
		double Y2 = sc.nextDouble();

		double line_length = lineLength(X1,Y1,X2,Y2);

		System.out.println("length: "+line_length);
	}
}
