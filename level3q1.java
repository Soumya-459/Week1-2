import java.util.Scanner;

public class level3q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        double celsius = sc.nextDouble();

        // Conversion
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        sc.close();
    }
}