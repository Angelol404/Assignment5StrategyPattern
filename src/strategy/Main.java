package strategy;

public class Main {

    public static void main(String[] args) {

        String start = "Astana IT University";
        String destination = "Khan Shatyr";
        double distanceKm = 12.0;

        Navigator navigator =
                new Navigator(new CarStrategy());

        System.out.println("=== Car Route ===");
        navigator.buildRoute(
                start,
                destination,
                distanceKm
        ).display();

        System.out.println("=== Walking Route ===");
        navigator.setStrategy(new WalkStrategy());
        navigator.buildRoute(
                start,
                destination,
                distanceKm
        ).display();

        System.out.println("=== Bicycle Route ===");
        navigator.setStrategy(new CycleStrategy());
        navigator.buildRoute(
                start,
                destination,
                distanceKm
        ).display();
    }
}