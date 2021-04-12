package MyProject;

public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = -7;
        int c = 3;

        Main main = new Main();
        main.calculateRoots(a, b, c);
    }
    /** Method for calculating the roots of quadratic equation */
    
    public String calculateRoots(int a, int b, int c) {
        double d = b*b -(4 * a * c);
        if(d < 0) {
            String result = "No real roots";
            System.out.println(result);
            return result;
        } else if(d == 0) {
            double root = -(b/(2*a));
            System.out.println("root = " + root);
            return "Only one real root";
        } else {
            double rootOne = (-b + Math.sqrt(d))/(2*a);
            double rootTwo = (-b - Math.sqrt(d))/(2*a);
            System.out.println("root 1 = " + rootOne);
            System.out.println("root 2 = " + rootTwo);
            return "Two real roots";
        }
    }
}
