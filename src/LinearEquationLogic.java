import java.sql.SQLOutput;
import java.util.Scanner;


//input/output class
public class LinearEquationLogic {


    //instance variables
    private Scanner myScanner;
    private LinearEquation LinearEquation;
    private String coordinate1;
    private String coordinate2;


    //constructor
    public LinearEquationLogic() {
        myScanner = new Scanner(System.in);
        coordinate1 = null;
        coordinate2 = null;
        LinearEquation = null;
    }


    // method that gets called which starts the program
    public void start() {
        getCoordinateInfo();
        getData();
    }


    //private helper method
    private void getCoordinateInfo() {
        System.out.println("Welcome to the slope calculator!");
        System.out.print("Enter coordinate 1 in the format \"(x, y):\" ");
        coordinate1 = myScanner.nextLine();
        System.out.print("Enter coordinate 2 in the format \"(x, y):\" ");
        coordinate2 = myScanner.nextLine();
        System.out.println(); //skips a line


        //parse out coordinates
        //note to self: these variables may be redundant
        int begin = coordinate1.indexOf("(");
        int stop = coordinate1.indexOf(",");
        int end = coordinate1.indexOf(")");
        int begin2 = coordinate2.indexOf("(");
        int stop2 = coordinate2.indexOf(",");
        int end2 = coordinate2.indexOf(")");


        String xPair1 = coordinate1.substring(begin + 1,stop);
        String yPair1 = coordinate1.substring(stop + 2,end);
        String xPair2 = coordinate2.substring(begin2 + 1,stop2);
        String yPair2 = coordinate2.substring(stop2 + 2,end2);


        //changing the coordinates from a string value to an int value
        int intX1 = Integer.parseInt(xPair1);
        int intY1 = Integer.parseInt(yPair1);
        int intX2 = Integer.parseInt(xPair2);
        int intY2 = Integer.parseInt(yPair2);


        //initialize instance variable
        LinearEquation = new LinearEquation(intX1, intY1, intX2, intY2);
    }


    //private helper method
    private void getData() {
        System.out.println(LinearEquation.lineInfo());
        System.out.println(); //skips a line
        System.out.print("Enter a value for x: ");
        double x = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.println(); //skips a line
        System.out.println(LinearEquation.coordinateForX(x));
        System.out.println(); //skips a line
    }
}