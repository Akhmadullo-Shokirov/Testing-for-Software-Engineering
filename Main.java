package MyProject;

public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = -7;
        int c = 3;

        Main main = new Main();
        System.out.println(main.calculateRoots(a, b, c));
    }

    public String calculateRoots(int a, int b, int c) {
        double d = b*b -(4 * a * c);
        if(d < 0) {
            return "No real roots";
        } else if(d == 0) {
            return "Only one real root";
        } else {
            return "Two real roots";
        }
    }
}
