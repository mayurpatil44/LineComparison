import java.util.*;
public class LineComparison {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
    //co-ordinates for line1
        System.out.println("Enter value of x1 ");
        int x1 = input.nextInt();

        System.out.println("Enter value of y1");
        int y1 = input.nextInt();

        System.out.println("Enter value of x2 ");
        int x2 = input.nextInt();

        System.out.println("Enter value of y2");
        int y2 = input.nextInt();

    //co-ordinates for line2
        System.out.println("Enter value of a1 ");
        int a1 = input.nextInt();

        System.out.println("Enter value of b1");
        int b1 = input.nextInt();

        System.out.println("Enter value of a2 ");
        int a2 = input.nextInt();

        System.out.println("Enter value of b2");
        int b2 = input.nextInt();

        double lengthOfline1 = 0;
        double lengthOfline2 = 0;

        lengthOfline1 = Math.sqrt(Math.pow((x2 - x1),2)+ Math.pow((y2 - y1),2));
        lengthOfline2 = Math.sqrt(Math.pow((a2 - a1),2)+ Math.pow((b2 - b1),2));
        System.out.println("Length of line is " + lengthOfline1+" length of line 2 is: "+lengthOfline2);

        System.out.println(Objects.equals(lengthOfline1, lengthOfline2));
    }
}



