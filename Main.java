package MyProject;

public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = -7;
        int c = 3;

        Main main = new Main();
        double resultDiscriminant = main.calculateD(a, b, c);
        System.out.println("D = " + resultDiscriminant);
        main.calculateRoots(a, b, resultDiscriminant);


    }

    private double calculateD(int a, int b, int c) {
        return b*b - (4 * a * c);
    }

    private void calculateRoots(int a, int b, double d) {
        if(d < 0) {
            System.out.println("No real roots");
        } else if(d == 0) {
            System.out.println("Only one real root");
        } else {
            System.out.println("Two real roots");
            double rootOne = (-b + Math.sqrt(d))/(2*a);
            double rootTwo = (-b - Math.sqrt(d))/(2*a);
            System.out.println("root 1 = " + rootOne);
            System.out.println("root 2 = " + rootTwo);
        }
    }


}
