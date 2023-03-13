public class Car extends Vehicle {

    private String plateNumber;
    private int year;


    public Car() {
    }

    public String toString() {
        return this.colour + " car plate: " + this.plateNumber + " manufactured in " + this.year;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber.toUpperCase();
    }

    ;

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws Exception {
        if (year < 1886) {
            throw new Exception("Year not eligible");
        }
        this.year = year;
    }


}

