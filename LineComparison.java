import java.util.*;
public class LineComparison {
	public static double XYCalculation() {
	Scanner input = new Scanner(System.in);

   	 //co-ordinates of line 1
	System.out.println("Enter the value of x2 ");
	int x2 = input.nextInt();

	System.out.println("Enter the value of y2");
	int y2 = input.nextInt();

	//co-ordinates of line 2
	System.out.println("Enter the value of a2 ");
	int a2 = input.nextInt();

	System.out.println("Enter the value of b2");
	int b2 = input.nextInt();

	int x1 = 0;
	int y1 = 0;
	int a1 = 0;
   	int b1 = 0;

	//calculation part
	double lengthofline1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	double lengthofline2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
	System.out.println("Length of line is " + lengthofline1 + " length of line 2 is: " + lengthofline2);

	return lengthofline1;
}
        public static void main(String args[]){
        	XYCalculation();
        }

}
