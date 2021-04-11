import java.lang.Math;
import java.util.*;
public class LineComaprison
{

	public static void main(String[] args)
	{

		int x1=2;
		int x2=3;
		int y1=2;
		int y2=4;

		int x3=2;
		int x4=5;
		int y3=2;
		int y4=4;

		double LengthOfLine1 = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
		System.out.println("Length of line 1 is: " +LengthOfLine1);

		double LengthOfLine2 = Math.sqrt((x4-x3)^2 + (y4-y3)^2);
		System.out.println("Length of line 2 is: " +LengthOfLine2);

		double obj1 = new Double(LengthOfLine1);
		double obj2 = new Double(LengthOfLine2);

		int compare = obj1.compareTo(obj2);

		if(compare == 1)
			System.out.println("Line 1 is gretter than Line 2");
		else if(compare == -1)
			System.out.println("Line 1 is less than Line 2");
		else if(compare == 0)
			System.out.println("Line1 and Line2 are equals");
	}
}
