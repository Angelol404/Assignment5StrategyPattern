package strategy;

public interface RouteStrategy {

    Route planRoute(
            String start,
            String destination,
            double distanceKm
    );
}