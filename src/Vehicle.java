public class Vehicle {
    protected String colour = "silver";

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "vehicle of colour " + this.colour;
    }
}
