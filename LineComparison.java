import java.util.*;

public class LineComparison {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of x1 ");
        int x1 = input.nextInt();

        System.out.println("Enter the value of y1");
        int y1 = input.nextInt();

        System.out.println("Enter the value of x2 ");
        int x2 = input.nextInt();

        System.out.println("Enter the value of y2");
        int y2 = input.nextInt();

        double lineLength = 0;
        lineLength = Math.sqrt(Math.pow((x2 - x1),2)+ Math.pow((y2 - y1),2));

        System.out.println("Length of line is " + lineLength);

    }
}
