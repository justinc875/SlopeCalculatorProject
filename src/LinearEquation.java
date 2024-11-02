public class LinearEquation {
    //instance variables
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    private final int numerator;
    private final int denominator;





    //constructor
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.numerator = (y2 - y1);
        this.denominator = (x2 - x1);
    }

    //checks if x's are equal, so vertical line would not ask to enter a value for x
    public boolean xEqual() {
        boolean xEqual = false;
        if (x1 == x2) {
            xEqual = true;
        }
        return xEqual;
    }


    public double distance() {
        return roundedToHundredth(Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));
    }




    public double yIntercept() {
        return roundedToHundredth(y1 - (slope() * x1));
    }




    public double slope() {
        return roundedToHundredth((double) (numerator) / (denominator));
    }

    public String slopeString() {
        double calculation = (double) numerator / denominator;
        int absY = Math.abs(numerator);
        int absX = Math.abs(denominator);
        int modifier = 1;
        if (numerator < 0) {
            modifier *= -1;
        }
        if (denominator < 0) {
            modifier *= -1;
        }
        if (Math.abs(calculation) % 1.0 == 0.0) {
            if (Math.abs(calculation) == 1.0) {
                if (calculation == 1) {
                    return "";
                } else return "-";
            }
            return (String.valueOf((int) calculation * modifier)); //I found String.valueOf off of Google, which converts a string into a number
        }
        return (absY * modifier) + "/" + absX;
    }


    public String equation() {
        if (numerator == 0) {
            return "The equation of the line between these points is: y = " + (int) yIntercept();
        }
        if (denominator == 0) {
            return "These points are on a vertical line: x = " + x1;
        }
        if (yIntercept() == 0) {
            return "The equation of the line between these points is: y = " + slopeString() + "x";
        }
        if (yIntercept() <= -1) {
            return "The equation of the line between these points is: y = " + slopeString() + "x " + yIntercept();
        } else
            return "The equation of the line between these points is: y = " + slopeString() + "x + " + yIntercept();
    }


    public String coordinateForX(double x) {
        double yIntercept = slope() * x + yIntercept();
        return "The point on the line is " + "(" + x + ", " + yIntercept + ")";
    }


    public String lineInfo() {
        if ((x2 - x1) == 0) {
            return equation();
        } else return "The two points are (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") \n" +
                equation() + "\n" +
                "The slope of this line is: " + slope() + "\n" +
                "The y-intercept of this line is: " + yIntercept() + "\n" +
                "The distance between these points is " + distance();
    }

    //helper methods
    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
}