package exchangeDesk;

public abstract class Currency {

    private double units;

    public Currency() {
    }

    public Currency(double units) {
        this.units = units;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }
}
