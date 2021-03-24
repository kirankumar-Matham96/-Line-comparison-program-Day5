import java.util.*;

//Using Abstract class & method overload
abstract class Line_Length_abstract
{
    abstract double lineLength(double x1, double y1, double x2, double y2);
    abstract int compareLines(Integer L1, Integer L2);
    abstract int compareLines(Double L1, Double L2);
}

//Using Inheritence
class Line_Length_Inherited extends Line_Length_abstract
{
    //Calculating Length of line
    public double lineLength(double x1, double y1, double x2, double y2)
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

    //method implementation
    public int compareLines(Integer L1, Integer L2)
    {
    	return (L1.compareTo(L2));
    }

    //method implementation
    public int compareLines(Double L1, Double L2)
    {
    	return (L1.compareTo(L2));
    }
}

//Multi-Level Inheritance (method over-riding)
class multi_Inheritance extends Line_Length_Inherited
{
    //method implementation second time
    public int compareLines(Double L1, Double L2)
    {
        Double l1 = L1;
        Double l2 = L2;
	return (l1.compareTo(l2));
    }
}

//Association/Aggregation used
public class LineComparisonProgram
{
    public static void main(String[] args)
    {
        //variables
        double X1=0, Y1=0, X2=0, Y2=0, x1=0, y1=0, x2=0, y2=0;
	double VAR_x1=0, VAR_y1=0, VAR_x2=0, VAR_y2=0;
	int result = 0;

        //Taking the input from the user
        System.out.println("Enter the co-ordinates of first line end points");
        for(int i=0;i<2;i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter X1 co-ordinate: ");
            VAR_x1 = sc.nextDouble();
            System.out.println("Enter Y1 co-ordinate: ");
            VAR_y1 = sc.nextDouble();
            System.out.println("Enter X2 co-ordinate: ");
            VAR_x2 = sc.nextDouble();
            System.out.println("Enter Y2 co-ordinate: ");
            VAR_y2 = sc.nextDouble();

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

	//creating object of a class
	Line_Length_abstract LLi = new multi_Inheritance();

	//Calling the method by reference and storing the returned value
	Double length_of_line_1 = LLi.lineLength(X1,Y1,X2,Y2);
	Double length_of_line_2 = LLi.lineLength(x1,y1,x2,y2);

	//comparing length of two lines
        result = LLi.compareLines(length_of_line_1, length_of_line_2);
	if(result == 0)
	{
            System.out.println("Two lines are equal in length");
	}
	else if(result == 1)
	{
            System.out.println("First line is bigger than the Second one");
	}
	else
	{
            System.out.println("Second line is bigger than the First one");
	}
    }
}
