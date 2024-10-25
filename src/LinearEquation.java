public class LinearEquation {
    //instance variables
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;




    //constructor
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }




    public double distance() {
        return roundedToHundredth (Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));
    }




    public double yIntercept() {
        return roundedToHundredth(y1 - (slope() * x1));
    }




    public double slope() {
        return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
    }




    public String equation() {
        int numerator = (y2 - y1);
        int denominator = (x2 - x1);


        if (numerator == 0) {
            return "y = " + yIntercept();
        } else if (denominator == 0) {
            return "y = " + yIntercept();
        } else return "y = " + numerator + "/" + denominator + "x + " + yIntercept();
    }




    public String coordinateForX(double x) {
        double yIntercept = slope() * x + yIntercept();
        return "The point on the line is " + "(" + x + ", " + yIntercept + ")";
    }




    public String lineInfo() {
        return "The two points are (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") \n" +
                "The equation of the line between these points is: " + equation() + "\n" +
                "The slope of this line is: " + slope() + "\n" +
                "The y-intercept of this line is: " + yIntercept() + "\n" +
                "The distance between these points is " + distance();
    }




    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
}