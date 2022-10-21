import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String args[]){
        float x = 0;
        float y = 0;
        float diff = 0;
        int low = 0;
        int high = 0;

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("");

        try {
            do {
                System.out.print("Please enter width: ");
                x = in.nextFloat();
                System.out.print("Please enter height: ");
                y = in.nextFloat();

            } while ( (x-y < 5 && x-y > -5) || (x-y> 10 || x-y < -10));

            if(Float.compare(x,y) > 0){
                diff = x-y;
                low = (int)y;
                high = (int)x;
            }

            else{
                diff = y-x;
                low = (int)x;
                high = (int)y;
            }

            System.out.print("Difference: ");
            if(diff == (int)diff)
                System.out.println(df.format(diff));
            else
                System.out.println(diff);

            for(int n = low; n <= high; n++){
                if(n%2 != 0)
                System.out.println(n);
            }

        }catch(InputMismatchException e){
            System.out.println("Please Enter Numbers");
        }


    }
}
