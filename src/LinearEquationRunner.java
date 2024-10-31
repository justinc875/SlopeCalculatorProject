public class LinearEquationRunner {
    public static void main(String[] args) {
        System.out.println("-------------- TESTING: EXTRA CREDIT TEST CASES --------------");
        LinearEquation eq6 = new LinearEquation(4, 0, 6, 10); // good for 5 slope
        LinearEquation eq7 = new LinearEquation(7, 14, 5, 10); // good for 2 slope NO Y-INT
        LinearEquation eq8 = new LinearEquation(6, 2, 8, -12); // good for -7 slope
        LinearEquation eq9 = new LinearEquation(-1, 3, 2, 6); // good for +1 slope
        LinearEquation eq10 = new LinearEquation(-1, 2, -3, 4); // good for -1 slope
        LinearEquation eq11 = new LinearEquation(-2, -2, 4, 4); // good for line through origin
        LinearEquation eq16 = new LinearEquation(0, 0, 4, 5); // good for 5/4 slope NO Y-INT
        LinearEquation eq17 = new LinearEquation(6, 1, 3, 2); // -1/3 slope
        LinearEquation eq20 = new LinearEquation(3, 2, 6, 1); // also -1/3
        LinearEquation eq18 = new LinearEquation(3, 1, 6, 2); // 1/3
        LinearEquation eq19 = new LinearEquation(6, 2, 3, 1); // also 1/3
        LinearEquation eq21 = new LinearEquation(5, 0, 10, 0); // y = 0
        System.out.println(eq6.equation());
        System.out.println(eq7.equation());
        System.out.println(eq8.equation());
        System.out.println(eq9.equation());
        System.out.println(eq10.equation());
        System.out.println(eq11.equation());
        System.out.println(eq16.equation());
        System.out.println(eq17.equation());
        System.out.println(eq20.equation());
        System.out.println(eq18.equation());
        System.out.println(eq19.equation());
        System.out.println(eq21.equation());
    }
}