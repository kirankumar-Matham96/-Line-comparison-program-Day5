import java.util.*;
public class LineComparisonProgram
{
	//Calculating Length of line
	public static double lineLength(double x1, double y1, double x2, double y2)
	{
		double length_of_line = 0;

		//For keeping the value positive inside 'sqrt' method
		if(x2 > x1 && y2 > y1)
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
		//variables
		double X1=0, Y1=0, X2=0, Y2=0, x1=0, y1=0, x2=0, y2=0;

		//Taking the input from the user
		System.out.println("Enter the co-ordinates of first line end points");
		for(int i=0;i<2;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter X1 co-ordinate: ");
			double VAR_x1 = sc.nextDouble();
			System.out.println("Enter Y1 co-ordinate: ");
			double VAR_y1 = sc.nextDouble();
			System.out.println("Enter X2 co-ordinate: ");
			double VAR_x2 = sc.nextDouble();
			System.out.println("Enter Y2 co-ordinate: ");
			double VAR_y2 = sc.nextDouble();

			//To avoid repeating above statements
			if(i==0)
			{	//first line co-ordinates
				X1 = VAR_x1;
				Y1 = VAR_y1;
				X2 = VAR_x2;
				Y2 = VAR_y2;
				System.out.println("Enter the co-ordinates of second line end points");
			}
			else
			{	//second line co-ordinates
				x1 = VAR_x1;
				y1 = VAR_y1;
				x2 = VAR_x2;
				y2 = VAR_y2;
			}
		}

		//Calling the method and storing the returned value
		double length_of_line_1 = lineLength(X1,Y1,X2,Y2);
		double length_of_line_2 = lineLength(x1,y1,x2,y2);

		//Creating objects for the variables
		Double dl1 = length_of_line_1;
		Double dl2 = length_of_line_2;

		//checking equality condition
		if(dl1.equals(dl2))
		{
			System.out.println("Two lines are equal in length");
		}
		else
		{
			System.out.println("Two lines are NOT equal in length");
		}
	}
}
