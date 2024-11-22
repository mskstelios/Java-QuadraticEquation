import java.util.Scanner;

class Quadratic_Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        int D = (int) ((Math.pow(b, 2)) - 4 * a * c);
        
        System.out.printf("Format: %dx^2 + %dx + %d%n%n", a, b, c);
        System.out.println("D: " + D);

        if (D > 0) {
            System.out.println("D > 0:");
            double x1 = (-b + Math.sqrt(D)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(D)) / (2.0 * a);
            System.out.printf("x1: " + x1 + "\n");
            System.out.println("x2: " + x2);
        } else if (D == 0) {
            System.out.println("D = 0:");
            double x1 = -b / (2.0 * a);
            System.out.printf("x1: " + x1);
        } else {
            System.out.println("No roots. Because D < 0");
        }

    }
}
