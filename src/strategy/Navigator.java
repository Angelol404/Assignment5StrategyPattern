package strategy;

import java.util.Objects;

public class Navigator {

    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(
                strategy,
                "Route strategy cannot be null"
        );
    }

    public Route buildRoute(
            String start,
            String destination,
            double distanceKm
    ) {
        if (start == null || start.isBlank()) {
            throw new IllegalArgumentException(
                    "Start location cannot be empty"
            );
        }

        if (destination == null || destination.isBlank()) {
            throw new IllegalArgumentException(
                    "Destination cannot be empty"
            );
        }

        if (!Double.isFinite(distanceKm) || distanceKm <= 0) {
            throw new IllegalArgumentException(
                    "Distance must be a positive finite number"
            );
        }

        return strategy.planRoute(
                start,
                destination,
                distanceKm
        );
    }
}