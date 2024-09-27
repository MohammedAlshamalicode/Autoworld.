package be.vdab.voertuigen;

public enum Maat {
    CENTIMETER(0.01), DECIMETER(0.1), METER(1.0);

    private final double waardeInMeter;

    Maat(double waardeInMeter) {
        this.waardeInMeter = waardeInMeter;
    }

    public double getWaardeInMeter() {
        return waardeInMeter;
    }
}
