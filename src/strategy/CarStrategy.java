package strategy;

public class CarStrategy implements RouteStrategy {

    private static final double AVERAGE_SPEED_KMH = 60.0;

    @Override
    public Route planRoute(
            String start,
            String destination,
            double distanceKm
    ) {
        double estimatedHours =
                distanceKm / AVERAGE_SPEED_KMH;

        return new Route(
                start,
                destination,
                distanceKm,
                estimatedHours,
                "Car"
        );
    }
}
