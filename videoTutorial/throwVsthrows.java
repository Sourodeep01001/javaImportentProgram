package videoTutorial;

class NegativeRadiusException extends Exception {
    public String toString() {
        return "Radius can not be negative";
    }

    public String getMessage() {
        return "Radius cannot be negative!";
    }

}

public class throwVsthrows {

    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
