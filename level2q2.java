import java.util.Scanner;

public class level2q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        // Area calculation
        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / 6.4516;

        // Output
        System.out.println("The Area of the triangle in sq in is " 
                + areaSqIn + " and sq cm is " + areaSqCm);

        sc.close();
    }
}