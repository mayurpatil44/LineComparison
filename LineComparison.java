import java.lang.Math;
import java.util.*;
public class LineComaprison
{
	private double LengthOfLine1;
	private double LengthOfLine2;

	private int x1;
	private int x2;
	private int x3;
	private int x4;

	private int y1;
	private int y2;
	private int y3;
	private int y4;

	public void readCoordinates()
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Read X coordinates");
		x1 = sc1.nextInt();
		x2 = sc1.nextInt();
		x3 = sc1.nextInt();
		x4 = sc1.nextInt();
		System.out.println("Read Y coordinates");
		y1 = sc1.nextInt();
		y2 = sc1.nextInt();
		y3 = sc1.nextInt();
		y4 = sc1.nextInt();

	}

	public void calculateLenght()
	{
		LengthOfLine1 = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
		System.out.println("Length of line 1 is: " +LengthOfLine1);

		LengthOfLine2 = Math.sqrt((x4-x3)^2 + (y4-y3)^2);
		System.out.println("Length of line 2 is: " +LengthOfLine2);

	}
	public void compareTwoLine()
	{
		Double obj1 = new Double(LengthOfLine1);
		Double obj2 = new Double(LengthOfLine2);

		int compare = obj1.compareTo(obj2);

		if(compare == 1)
			System.out.println("Line 1 is gretter than Line 2");
		else if(compare == -1)
			System.out.println("Line 1 is less than Line 2");
		else if(compare == 0)
		System.out.println("Line1 and Line2 are equals");
	}
	public static void main(String[] args)
	{

		LineComaprison L1 = new LineComaprison();
		L1.readCoordinates();
		L1.calculateLenght();
		L1.compareTwoLine();

	}
}

