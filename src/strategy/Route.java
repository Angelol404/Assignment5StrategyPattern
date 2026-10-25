package strategy;

public record Route(
        String start,
        String destination,
        double distanceKm,
        double estimatedHours,
        String transport
) {
    public void display() {
        System.out.println("Transport: " + transport);
        System.out.println("From: " + start);
        System.out.println("To: " + destination);
        System.out.printf("Distance: %.2f km%n", distanceKm);
        System.out.printf(
                "Estimated time: %.2f hours%n",
                estimatedHours
        );
        System.out.println("------------------------------");
    }
}