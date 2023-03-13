public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setPlateNumber("Mt59 lpt");
        try {
            myCar.setYear(2023);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        myCar.setColour("Red");
        System.out.println(myCar);

        Bike myBike = new Bike();
        myBike.setColour("White");
        System.out.println(myBike);


    }
}
