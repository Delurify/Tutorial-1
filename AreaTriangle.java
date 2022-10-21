import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String args[]) {
        float x = 0;
        float y = 0;
        float area = 0;
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("");

        try {
            do {

                System.out.print("Please enter width: ");
                x = in.nextFloat();
                System.out.print("Please enter height: ");
                y = in.nextFloat();


            } while (x < 2 || x > 10 || y < 2 || y > 10);

            area = x * y / 2;

            if (area == (int) area) {
                System.out.println("The area of triangle: " + df.format(area));
            } else
                System.out.println("The area of triangle: " + area);

        } catch (InputMismatchException e) {
            System.out.println("Please enter numbers");


        }
    }
}