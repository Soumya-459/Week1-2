import java.util.Scanner;

public class level3q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User inputs
        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();

        double fromToVia = sc.nextDouble();       // distance in miles
        double viaToFinalCity = sc.nextDouble();  // distance in miles

        int timeFromToVia = sc.nextInt();         // time in minutes
        int timeViaToFinalCity = sc.nextInt();    // time in minutes

        // Distance calculation
        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934;

        // Time calculation
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Output
        System.out.println("The Total Distance travelled by " + name + 
                " from " + fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistanceKm + " km and the Total Time taken is " +
                totalTime + " minutes");

        sc.close();
    }
}